public class Blusa extends PecaVestuario{
    public Blusa(float preco, String nome, String marca, String codigo, String material, char genero, String tamanho) {
        super(preco, nome, marca, codigo, material, genero, tamanho);
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
