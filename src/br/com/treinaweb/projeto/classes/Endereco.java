package br.com.treinaweb.projeto.classes;

public class Endereco {
    private Cliente cliente;
    private String logradouro;
    private int numero;
    private String complemento;
    private String cidade;
    private String estado;

    public void cadatroEndereco(Cliente cliente, 
                                String logradouro, 
                                int numero, 
                                String complemento,
                                String cidade,
                                String estado){
        this.cliente = cliente;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getEndereco(){
        String dados = "";
        dados = "\n\t----- Endereço -----\n";
        dados += "Endereço: " + this.logradouro + "\n";
        dados += "Número: " + this.numero + "\n";
        dados += "Complemento: " + this.complemento + "\n";
        dados += "Cidade: " + this.cidade + "\n";
        dados += "Estado: " + this.estado + "\n";
        return dados;
    }
    
}
