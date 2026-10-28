public class QuartoSuite extends Quarto {

    public String verificarAprovacao() {
        if (this.calcularMedia() >= 8.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    @Override
    public String getTipo() {
        return "QuartoSuite";
    }
}
