public class Chinelo extends Calcado{

    @Override
    public double calcularFrete() {
        return 0;
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
