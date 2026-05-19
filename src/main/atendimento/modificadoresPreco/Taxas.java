package main.atendimento.modificadoresPreco;

import main.atendimento.IAtendimento;

public interface Taxas {
    IAtendimento atendimento = null;
    float getPreco();
}
