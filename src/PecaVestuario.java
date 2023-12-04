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

     public PecaVestuario(String tipo, int quantidadeEstoque, String tamanho, String cor) {
          super(tipo, quantidadeEstoque);
          this.tamanho = tamanho;
          this.cor = cor;
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
          return super.toString() + ", tamanho=" + tamanho + ", cor=" + cor;
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
