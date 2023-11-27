public class NumeroIncorretoException extends Exception{
    private String mensagem;
    public NumeroIncorretoException(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
