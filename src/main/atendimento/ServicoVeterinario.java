package main.atendimento;

public class ServicoVeterinario {
    String nome;
    float valor;

    public ServicoVeterinario(String nome, float valor){
        this.nome = nome;
        this.valor = valor;
    }

    public float getPreco() {
        return this.valor;
    }
}
