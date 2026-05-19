package main.atendimento.modificadoresPreco;

import main.atendimento.IAtendimento;

public class BanhoPosConsulta implements Taxas {
    public BanhoPosConsulta(IAtendimento atendimento){
        super(atendimento);
    }
    @Override
    public float getPreco() {
        return atendimento.getPreco()+50;
    }
}
