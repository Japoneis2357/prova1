package main.atendimento.estado;

import main.atendimento.IAtendimento;

public class EstadoAgendado extends AtendimentoEstado{
    private EstadoAgendado(){}
    private static EstadoAgendado instance = new EstadoAgendado();

    public static EstadoAgendado getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Agendado";
    }

    public boolean cancelar(IAtendimento atendimento){
        atendimento.setEstado(EstadoCancelado.getInstance());
        return true;
    }

    public boolean atender(IAtendimento atendimento){
        atendimento.setEstado(EstadoEmAtendimento.getInstance());
        return true;
    }
}
