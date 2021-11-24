
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoTest {

    @Test
    void simularAtendimentoUTI() {
        Atendimento atendimento = new Atendimento();
        assertEquals("Bem vindo ao Hospital St. Claude!\n"+
                        "Seu atestado de internação na UTI foi emitido.\n" +
                        ">>Relatório Triagem: Paciente sofreu acidente de motocicleta e apresenta múltiplas fraturas",
                atendimento.atendimentoUTI("Relatório Triagem: Paciente sofreu acidente de motocicleta e apresenta múltiplas fraturas"));
    }

    @Test
    void simularAtendimentoExames() {
        Atendimento atendimento = new Atendimento();
        assertEquals("Bem vindo ao Hospital St. Claude!\n"+
                        "Seu atestado de realização de exames foi emitido.\n" +
                        ">>Relatório Triagem: Paciente encaminhado após consulta médica para realizar Radiografia Pulmonar.",
                atendimento.atendimentoExames("Relatório Triagem: Paciente encaminhado após consulta médica para realizar Radiografia Pulmonar."));
    }

    @Test
    void simularAtendimentoConsulta() {
        Atendimento atendimento = new Atendimento();
        assertEquals("Bem vindo ao Hospital St. Claude!\n"+
                        "Seu atestado de Consulta de Rotina foi emitido.\n" +
                        ">>Relatório Triagem: Paciente se queixa de fortes dores de cabeça. Pressão arterial elevada.",
                atendimento.atendimentoConsulta("Relatório Triagem: Paciente se queixa de fortes dores de cabeça. Pressão arterial elevada."));
    }

}