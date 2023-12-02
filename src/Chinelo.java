public class Chinelo extends Calcado{

    public Chinelo(float preco, String nome, String marca, String codigo, String material, char genero, String tamanho,  int numero, boolean cadarco) {
        super(preco, nome, marca, codigo, material, genero, tamanho, numero, cadarco);

    }

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
