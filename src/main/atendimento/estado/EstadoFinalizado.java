package main.atendimento.estado;

public class EstadoFinalizado extends AtendimentoEstado{
    private EstadoFinalizado(){}
    private static EstadoFinalizado instance = new EstadoFinalizado();

    public static EstadoFinalizado getInstance() {
        return instance;
    }
}
