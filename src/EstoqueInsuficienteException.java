public class EstoqueInsuficienteException extends Exception{
    private String mensagem;

    public EstoqueInsuficienteException(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
