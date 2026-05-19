package main.atendimento;

import main.atendimento.estado.AtendimentoEstado;
import main.atendimento.estado.EstadoAgendado;

public class AtendimentoClinica extends IAtendimento{
    public AtendimentoClinica(){
        this.estado = EstadoAgendado.getInstance();
    }
}
