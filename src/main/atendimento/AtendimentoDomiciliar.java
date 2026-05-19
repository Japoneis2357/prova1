package main.atendimento;

import main.atendimento.estado.AtendimentoEstado;
import main.atendimento.estado.EstadoAgendado;

public class AtendimentoDomiciliar extends IAtendimento {
    private AtendimentoEstado estado;

    public AtendimentoDomiciliar(){
        this.estado = EstadoAgendado.getInstance();
    }
}
