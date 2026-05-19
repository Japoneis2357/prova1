package test;

import main.atendimento.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAtendimento {
    @Test
    void deveCalcularValorConsultaDomiciliar(){
        ServicoVeterinario servico = new ServicoVeterinario("Atendimento",50.0f);
        AtendimentoDomiciliar atendimento = new AtendimentoDomiciliar();

        atendimento.addServico(servico);

        assertEquals(70.0f, atendimento.getPreco());
    }

    @Test
    void deveCalcularValorConsulta(){
        ServicoVeterinario servico = new ServicoVeterinario("Atendimento",50.0f);
        AtendimentoClinica atendimento = new AtendimentoClinica();

        atendimento.addServico(servico);

        assertEquals(50.0f, atendimento.getPreco());
    }
}
