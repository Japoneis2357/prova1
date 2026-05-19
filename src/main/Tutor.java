package main.atendimento;

import java.util.Observable;
import java.util.Observer;

public class Tutor implements Observer {
    private String nome;
    private String ultimaNotificacao;
    @Override
    public void update(Observable atendimento, Object arg) {
        this.ultimaNotificacao = nome + atendimento.toString();
    }
}
