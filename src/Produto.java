public abstract class Produto extends Object{
    private String tipo;
    private int quantidadeEstoque;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    Produto(String tipo, int quantidadeEstoque){
        this.tipo = tipo;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public abstract boolean verificarEstoque() throws EstoqueInsuficienteException;

    public abstract double calcularFrete() throws FreteIndisponivelException;

    public abstract void aplicarPromocao() throws PromocaoInexistenteException;

    @Override
    public String toString() {
        return "Produto{" +
                "Tipo='" + tipo + '\'' +
                ", quantidade em Estoque= " + quantidadeEstoque +
                '}';
    }

}