import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuartoStandardTest {

    @Test
    void deveRetonarAprovado() {
        QuartoStandard quarto = new QuartoStandard();
        quarto.setNotaLimpeza(6.0f);
        quarto.setNotaConforto(6.0f);
        assertEquals("Aprovado", quarto.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        QuartoStandard quarto = new QuartoStandard();
        quarto.setNotaLimpeza(6.0f);
        quarto.setNotaConforto(5.9f);
        assertEquals("Reprovado", quarto.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        QuartoStandard quarto = new QuartoStandard();
        quarto.setNotaLimpeza(6.0f);
        quarto.setNotaConforto(5.9f);
        quarto.setNome("Jardim");
        quarto.setNumero(102);
        assertEquals("Quarto{numero=102, nome='Jardim', resultado=Reprovado}", quarto.getInfo());
    }
}
