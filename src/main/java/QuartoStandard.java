public class QuartoStandard extends Quarto {

    public String verificarAprovacao() {
        if (this.calcularMedia() >= 6.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

}
