package main.atendimento.estado;

import main.atendimento.IAtendimento;

public abstract class AtendimentoEstado {
    public String getEstado(){
        return "";
    }

    public boolean agendar(IAtendimento atendimento){
        return false;
    }

    public boolean cancelar(IAtendimento atendimento){
        return false;
    }

    public boolean atender(IAtendimento atendimento){
        return false;
    }

    public boolean finalizar(IAtendimento atendimento){
        return false;
    }
}
