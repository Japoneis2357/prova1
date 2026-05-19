package main.atendimento;

import main.atendimento.estado.AtendimentoEstado;
import main.atendimento.estado.EstadoAgendado;

public class AtendimentoDomiciliar extends IAtendimento {
    private AtendimentoEstado estado;

    public AtendimentoDomiciliar(){
        this.estado = EstadoAgendado.getInstance();

    }

    public float getPreco(){
        float precoFinal = 0.0f;
        for (ServicoVeterinario servico : servicos) {
            precoFinal += servico.getPreco();
        }
        return precoFinal+20;
    }
}
