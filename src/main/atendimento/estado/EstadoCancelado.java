package main.atendimento.estado;

public class EstadoCancelado extends AtendimentoEstado{
    private EstadoCancelado(){}
    private static EstadoCancelado instance = new EstadoCancelado();

    public static EstadoCancelado getInstance() {
        return instance;
    }


}
