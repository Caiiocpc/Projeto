package br.com.treinaweb.projeto.excecoes;

public class DepositoInvalidoException extends Exception{

    private static final long serialVersionUID = 3089171279920463324L;

    public DepositoInvalidoException(){
        super(String.format("Seu depósito não foi efetuado"
                            + ", tente novamente."));
    }
    
}
