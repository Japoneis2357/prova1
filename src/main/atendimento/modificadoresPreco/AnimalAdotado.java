package main.atendimento.modificadoresPreco;

import main.atendimento.IAtendimento;

public class AnimalAdotado implements Taxas {
    public AnimalAdotado(IAtendimento atendimento){
        super(atendimento);
    }
    @Override
    public float getPreco() {
        return atendimento.getPreco()*0.9f;
    }
}
