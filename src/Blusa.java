public class Blusa extends PecaVestuario{
    public Blusa(String tipo, int quantiadeEstoque,String tamanho, String cor){
        super(tipo,quantiadeEstoque,tamanho,cor);
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
