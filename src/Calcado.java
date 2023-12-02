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

    public Calcado(float preco, String nome, String marca, String codigo, String material, char genero, String tamanho, int numero, boolean cadarco) {
        super(preco, nome, marca, codigo, material, genero, tamanho);
        this.numero = numero;
        this.cadarco = cadarco;
    }
}
