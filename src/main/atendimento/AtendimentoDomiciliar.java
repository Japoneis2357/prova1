package main.atendimento;

import main.atendimento.estado.AtendimentoEstado;
import main.atendimento.estado.EstadoAgendado;

public class AtendimentoDomiciliar implements IAtendimento {
    private AtendimentoEstado estado;

    public AtendimentoDomiciliar(){
        this.estado = EstadoAgendado.getInstance();
    }

    public void setEstado(AtendimentoEstado estado){
        this.estado = estado;
    }
}
