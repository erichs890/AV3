public class Chinelo extends Calcado{

    public Chinelo(String tipo, int quantidadeEstoque, String cor,int numero) {
        super(tipo, quantidadeEstoque,cor,numero, true);
        super.cadarco = false;
    }

    @Override
    public double calcularFrete() {
        return 0;
    }

    @Override
    public void aplicarPromocao() throws PromocaoInexistenteException {

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
