package test;

import main.atendimento.AtendimentoDomiciliar;
import main.atendimento.AtendimentoFactory;
import main.atendimento.IAtendimento;
import main.atendimento.ServicoVeterinario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAtendimento {
    @Test
    void deveCalcularValorConsulta(){
        ServicoVeterinario servico = new ServicoVeterinario("Atendimento",50.0f);
        IAtendimento atendimento = AtendimentoFactory.obterServico("Clinica");

        atendimento.addServico(servico);

        assertEquals(50.0f, atendimento.getPreco());
    }
}
