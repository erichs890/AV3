public class PromocaoInexistenteException extends Exception {

    private String mensagem;

    public PromocaoInexistenteException(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
