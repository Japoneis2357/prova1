package main.atendimento;

import main.atendimento.estado.AtendimentoEstado;

public class AtendimentoClinica implements IAtendimento{
    private AtendimentoEstado estado;

    public void setEstado(AtendimentoEstado estado){
        this.estado = estado;
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
}
