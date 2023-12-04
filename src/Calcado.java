public abstract class Calcado extends PecaVestuario {
    private int numero;
    private boolean cadarco;

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

    public Calcado(String tipo, int quantidadeEstoque,String tamanho, String cor,int numero) {
        super(tipo, quantidadeEstoque, tamanho, cor);
        this.numero = numero;
        this.cadarco = cadarco;
    }

    public abstract boolean estaValido();
}
