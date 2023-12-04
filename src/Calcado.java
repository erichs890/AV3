public abstract class Calcado extends PecaVestuario {
    protected int numero;
    protected boolean cadarco;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isCadarco() {
        return cadarco;
    }

    public void setCadarco(boolean cadarco) {
        this.cadarco = cadarco;
    }

    public Calcado(String tipo, int quantidadeEstoque, String cor, int numero, boolean b) {
        super(tipo, quantidadeEstoque, cor);
        this.numero = numero;
        this.cadarco = cadarco;
    }

    public abstract boolean estaValido();
}
