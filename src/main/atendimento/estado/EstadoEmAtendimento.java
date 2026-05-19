package main.atendimento.estado;

import main.atendimento.IAtendimento;

public class EstadoEmAtendimento extends AtendimentoEstado{
    private EstadoEmAtendimento(){}
    private static EstadoEmAtendimento instance = new EstadoEmAtendimento();

    public static EstadoEmAtendimento getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Em Atendimento";
    }

    public boolean finalizar(IAtendimento atendimento){
        atendimento.setEstado(EstadoFinalizado.getInstance());
        return true;
    }
}
