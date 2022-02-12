package br.com.guiareze.cacheproject.persistence.exception;

public class FormaPagamentoInexistenteException extends RuntimeException{

    public FormaPagamentoInexistenteException(){
        super("Forma de pagamento não existe no banco de dados");
    }
}
