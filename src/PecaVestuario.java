public abstract class PecaVestuario extends Produto implements Entrega, Perecivel {
     private String tamanho; // pp p m g gg
     private String cor;

     public String getTamanho() {
          return tamanho;
     }

     public void setTamanho(String tamanho) {
          this.tamanho = tamanho;
     }

     public String getCor() {
          return cor;
     }

     public void setCor(String cor) {
          this.cor = cor;
     }

     public PecaVestuario(float preco, String nome, String marca, String codigo, String material, char genero, String tamanho) {
          super(preco, nome, marca, codigo, material, genero);
          this.tamanho = tamanho;
     }

     @Override
     public boolean verificarEstoque() throws EstoqueInsuficienteException {
          return false;
     }

     @Override
     public double calcularFrete() {
          return 0;
     }

     @Override
     public void aplicarPromoção() throws PromocaoInexistenteException {

     }

     public String toString(){
          return super.toString() + ", tamanho=" + tamanho + ", cor=" + cor + ", gênero=" + getGenero();
     }

     @Override
     public double prazoValidadeEmDias() {
          return 0;
     }

     @Override
     public boolean estaValido() {
          return false;
     }
}
