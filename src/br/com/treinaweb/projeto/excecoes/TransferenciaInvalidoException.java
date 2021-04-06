package br.com.treinaweb.projeto.excecoes;

public class TransferenciaInvalidoException extends Exception{

    private static final long serialVersionUID = 8816257140973985987L;

    public TransferenciaInvalidoException(){
        super(String.format("Não foi possível realizar a transferência!"));
         
    }
    
}
