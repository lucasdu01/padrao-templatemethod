public abstract class Quarto {

    private int numero;
    protected String nome;
    private float notaLimpeza;
    private float notaConforto;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaLimpeza() {
        return notaLimpeza;
    }

    public void setNotaLimpeza(float notaLimpeza) {
        this.notaLimpeza = notaLimpeza;
    }

    public float getNotaConforto() {
        return notaConforto;
    }

    public void setNotaConforto(float notaConforto) {
        this.notaConforto = notaConforto;
    }

    public float calcularMedia() {
        return (this.notaLimpeza + this.notaConforto) / 2;
    }

    public abstract String verificarAprovacao();

    public String getTipo() {
        return "Quarto";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "numero=" + this.numero +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarAprovacao() +
                '}';
    }
}
