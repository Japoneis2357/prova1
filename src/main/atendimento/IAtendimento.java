package main.atendimento;

import main.atendimento.estado.AtendimentoEstado;

import java.util.List;
import java.util.Observable;

    public abstract class IAtendimento extends Observable {
    protected AtendimentoEstado estado;

    List<ServicoVeterinario> servicos;

    public float getPreco(){
        float precoFinal = 0.0f;
        for (ServicoVeterinario servico : servicos) {
            precoFinal += servico.getPreco();
        }
    }

    public void addServico(ServicoVeterinario servico){
        servicos.add(servico);
    }

    public void setEstado(AtendimentoEstado estado){
        this.estado = estado;
        setChanged();
        notifyObservers();
    }

    public boolean agendar(){
        return estado.agendar(this);
    }

    public boolean cancelar(){
        return estado.cancelar(this);
    }

    public boolean atender(){
        return estado.atender(this);
    }

    public boolean finalizar(){
        return estado.finalizar(this);
    }

    public String toString() {
        return "Atendimento" + estado.getEstado();
    }
}
