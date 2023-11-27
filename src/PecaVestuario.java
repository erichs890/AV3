public abstract class PecaVestuario extends Produto implements Entrega, Perecivel {
     String tamanho; // pp p m g gg
     String cor;

     public PecaVestuario(float preco, String nome, String marca, String codigo, String material, char genero, String tamanho) {
          super(preco, nome, marca, codigo, material, genero);
          this.tamanho = tamanho;
          this.cor = cor;
     }
     public String toString(){
          return super.toString() + ", tamanho=" + tamanho + ", cor=" + cor + ", gênero=" + genero;
     }
}
