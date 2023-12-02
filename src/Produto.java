public abstract class Produto {
    private float preco;
    private String nome;
    private String marca;
    private String codigo; //pode começar com 0
    private String material;
    private char genero; // masculino ou feminino (m ou f)
    private int quantidadeEstoque;

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

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
