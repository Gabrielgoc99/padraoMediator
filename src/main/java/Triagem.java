
public class Triagem {

    public String atendimentoUTI (String relatorio) {
        return Hospital.getInstancia().atestadoEncaminhamentoUTI(relatorio);
    }

    public String atendimentoExames (String relatorio) {
        return Hospital.getInstancia().atestadoEncaminhamentoExame(relatorio);
    }

    public String atendimentoConsulta (String relatorio) {
        return Hospital.getInstancia().atestadoEncaminhamentoConsulta(relatorio);
    }


}