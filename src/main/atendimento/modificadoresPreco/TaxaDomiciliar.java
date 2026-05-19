package main.atendimento.modificadoresPreco;

import main.atendimento.IAtendimento;

public class TaxaDomiciliar implements Taxas {
    public TaxaDomiciliar(IAtendimento atendimento) {
        super(atendimento);
    }

    @Override
    public float getPreco() {
        return atendimento.getPreco()+20;
    }
}