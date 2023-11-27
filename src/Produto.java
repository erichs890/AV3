public abstract class Produto extends Object {
    float preco;
    String nome;
    String marca;
    String codigo; //pode começar com 0
    String material;
    char genero; // masculino ou feminino (m ou f)
    public Produto(float preco, String nome, String marca, String codigo, String material, char genero){
        this.preco = preco;
        this.nome = nome;
        this.marca = marca;
        this.codigo = codigo;
        this.material = material;
        this.genero = genero;
    }
    public abstract String toString();

    public abstract boolean verificarEstoque();


}
