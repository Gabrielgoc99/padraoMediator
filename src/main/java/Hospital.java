public class Hospital {
    private static Hospital instancia = new Hospital();

    private Hospital() {}

    public static Hospital getInstancia() {
        return instancia;
    }

    public String atestadoEncaminhamentoUTI (String atestado) {
        return "Bem vindo ao Hospital St. Claude!\n"+
                "Seu atestado de internação na UTI foi emitido.\n" +
                ">>" + Clinica.getInstancia().encaminhamentoUTI(atestado);
    }

    public String atestadoEncaminhamentoExame (String atestado) {
        return "Bem vindo ao Hospital St. Claude!\n"+
                "Seu atestado de realização de exames foi emitido.\n" +
                ">>" + Clinica.getInstancia().encaminhamentoExame(atestado);
    }

    public String atestadoEncaminhamentoConsulta (String atestado) {
        return "Bem vindo ao Hospital St. Claude!\n"+
                "Seu atestado de Consulta de Rotina foi emitido.\n" +
                ">>" + Clinica.getInstancia().encaminhamentoConsulta(atestado);
    }
}
