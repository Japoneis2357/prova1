package main.atendimento.estado;

public class EstadoCancelado extends AtendimentoEstado{
    private EstadoCancelado(){}
    private static EstadoCancelado instance = new EstadoCancelado();

    public static EstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Cancelado";
    }

}
