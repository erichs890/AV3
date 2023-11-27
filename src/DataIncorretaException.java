public class DataIncorretaException extends Exception{
    private String mensagem;
    public DataIncorretaException(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
