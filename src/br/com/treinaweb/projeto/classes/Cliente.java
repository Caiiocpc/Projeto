package br.com.treinaweb.projeto.classes;

public class Cliente {
    private String nome;
    private String nomeMae;
    private String cpf;
    private String rg;

    public void cadastroCliente(String nome, String cpf,
                                String rg, String nomeMae){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.nomeMae = nomeMae;
    
    }

    public String exibirDados(){
        String dados = "\n\t ----- Dados Pessoais -----\n";
        dados += "Nome: " + this.nome + "\n";
        dados += "CPF: " + this.cpf + "\n";
        dados += "RG: " +this.rg + "\n";
        dados += "Nome da mãe: " + this.nomeMae;
        return dados;
    }
    
}
