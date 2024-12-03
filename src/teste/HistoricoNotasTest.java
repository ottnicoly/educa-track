package teste;

import org.junit.Test;
import sistema.model.Aluno;
import sistema.model.Nota;

import static org.junit.Assert.assertTrue;

public class HistoricoNotasTest {

    @Test
    public void testConsultaHistoricoNotas() {
        Nota nota = new Nota();
        Aluno joao = new Aluno("João Silva");
        joao.adicionarNota(8.0);
        joao.adicionarNota(7.5);

        String historico = joao.consultarHistorico();

        assertTrue(historico.contains("João Silva"));
        assertTrue(historico.contains("Nota 1: 8.0"));
        assertTrue(historico.contains("Nota 2: 7.5"));
        assertTrue(historico.contains("Média: 7.75"));
    }

}
