package teste;

import org.junit.Test;
import sistema.service.ExibicaoNotas;

import static org.junit.Assert.assertTrue;

public class ExibicaoNotasTest {

    @Test
    public void testExibirNotasEMedia() {
        ExibicaoNotas exibicao = new ExibicaoNotas();
        String resultado = exibicao.exibirNotas("12345");

        assertTrue(resultado.contains("Notas"));
        assertTrue(resultado.contains("Média"));
    }

}
