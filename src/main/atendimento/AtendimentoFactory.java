package main.atendimento;

public class AtendimentoFactory {
    public static IAtendimento obterServico(String tipo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("main.atendimento.Atendiento" + tipo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo inexistente");
        }
        if (!(objeto instanceof IAtendimento)) {
            throw new IllegalArgumentException("Tipo inválido");
        }
        return (IAtendimento) objeto;
    }
}
