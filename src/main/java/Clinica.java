
public class Clinica implements Setor{
    private static Clinica instancia = new Clinica();

    private Clinica() {}

    public static Clinica getInstancia() {
        return instancia;
    }

    public String encaminhamentoUTI (String relatorio) {
        return relatorio;
    }

    public String encaminhamentoExame (String relatorio) {
        return relatorio;
    }

    public String encaminhamentoConsulta (String relatorio) {
        return relatorio;
    }
}

