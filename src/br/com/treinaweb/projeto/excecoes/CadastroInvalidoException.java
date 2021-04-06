package br.com.treinaweb.projeto.excecoes;

public class CadastroInvalidoException extends Exception{

    private static final long serialVersionUID = 127469902033280691L;

    public CadastroInvalidoException(){
        super(String.format("Número da conta ou saldo incorreto."));
    }
    
}
