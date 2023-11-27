public class FreteIndisponivelException extends Exception {

    private String mensagem;

    public FreteIndisponivelException(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
