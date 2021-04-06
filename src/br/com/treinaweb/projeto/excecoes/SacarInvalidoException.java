package br.com.treinaweb.projeto.excecoes;

public class SacarInvalidoException extends Exception{

    private static final long serialVersionUID = -525259920129907135L;

    public SacarInvalidoException(){
        super(String.format("Saldo insuficiente para realizar o saque."));
    }
    
}
