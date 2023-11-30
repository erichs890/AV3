public abstract class Produto {
    float preco;
    String nome;
    String marca;
    String codigo; //pode começar com 0
    String material;
    char genero; // masculino ou feminino (m ou f)
    int quantidadeEstoque
    public Produto(float preco, String nome, String marca, String codigo, String material, char genero){
        this.preco = preco;
        this.nome = nome;
        this.marca = marca;
        this.codigo = codigo;
        this.material = material;
        this.genero = genero;
    }
    public abstract boolean verificarEstoque() throws EstoqueInsuficienteException;

    public abstract double calcularFrete() throws FreteIndisponivelException;

    public abstract void aplicarPromoção() throws PromocaoInexistenteException;

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preço=" + preco +
                ", quantidadeEmEstoque=" + quantidadeEstoque +
                '}';
    }

}
