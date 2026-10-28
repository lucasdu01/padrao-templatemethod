import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuartoSuiteTest {

    @Test
    void deveRetonarAprovado() {
        QuartoSuite quarto = new QuartoSuite();
        quarto.setNotaLimpeza(8.0f);
        quarto.setNotaConforto(8.0f);
        assertEquals("Aprovado", quarto.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        QuartoSuite quarto = new QuartoSuite();
        quarto.setNotaLimpeza(8.0f);
        quarto.setNotaConforto(7.9f);
        assertEquals("Reprovado", quarto.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        QuartoSuite quarto = new QuartoSuite();
        quarto.setNotaLimpeza(8.0f);
        quarto.setNotaConforto(8.0f);
        quarto.setNome("Vista Mar");
        quarto.setNumero(301);
        assertEquals("QuartoSuite{numero=301, nome='Vista Mar', resultado=Aprovado}", quarto.getInfo());
    }
}
