public class Chinelo extends Calcado{

    public Chinelo(String tipo, int quantidadeEstoque, String tamanho, String cor,int numero, boolean cadarco) {
        super(tipo, quantidadeEstoque,tamanho, cor,numero);
        cadarco = false;
    }

    @Override
    public double calcularFrete() {
        return 0;
    }

    @Override
    public void aplicarPromoção() throws PromocaoInexistenteException {

    }

    @Override
    public double prazoValidadeEmDias() {
        return 0;
    }

    @Override
    public boolean estaValido() {
        return false;
    }

    @Override
    public boolean verificarEstoque() {
        return false;
    }
}
