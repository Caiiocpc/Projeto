package br.com.treinaweb.projeto.main;

import br.com.treinaweb.projeto.classes.Cliente;
import br.com.treinaweb.projeto.classes.Conta;
import br.com.treinaweb.projeto.classes.ContaCorrente;
import br.com.treinaweb.projeto.classes.ContaPoupanca;
import br.com.treinaweb.projeto.classes.Endereco;
import br.com.treinaweb.projeto.excecoes.CadastroInvalidoException;
import br.com.treinaweb.projeto.excecoes.DepositoInvalidoException;
import br.com.treinaweb.projeto.excecoes.SacarInvalidoException;
import br.com.treinaweb.projeto.excecoes.TransferenciaInvalidoException;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            Cliente caio = new Cliente();
            caio.cadastroCliente("Caio Cesar", 
                                "999.999.999-99", "99.999.999-9", 
                                "Claudia");

            Endereco caioEndereco = new Endereco();
            caioEndereco.cadatroEndereco(caio, "Rua: Frei", 
                                        3500, "Apartamento 2500", "São Paulo", 
                                        "São Paulo");

            Conta caioContaBancaria = new Conta();
            ContaCorrente caioContaCorrente = new ContaCorrente("99999-1", 250);
            ContaPoupanca caioContaPoupanca = new ContaPoupanca("99999-2", 1000);        
            caioContaBancaria.contaBancaria(caio, caioEndereco, caioContaCorrente, caioContaPoupanca);

            Cliente apolo = new Cliente();
            apolo.cadastroCliente("Apolo Candido", 
                                "999.999.999-99", "99.999.999-9", 
                                "Lais Rocha");

            Endereco apoloEndereco = new Endereco();
            apoloEndereco.cadatroEndereco(apolo, "Rua: Frei", 
                                        3500, "Apartamento 2500", "São Paulo", 
                                        "São Paulo");

            ContaCorrente apoloCorrente = new ContaCorrente("99998-1" , 250.00);
            ContaPoupanca apoloPoupanca = new ContaPoupanca("99998-2", 1000.00);

            Conta apoloContaBancaria = new Conta();
            apoloContaBancaria.contaBancaria(apolo, apoloEndereco, apoloCorrente, apoloPoupanca);
            
            System.out.println(caioContaBancaria.exibirContaBancaria());
            System.out.println(apoloContaBancaria.exibirContaBancaria());
            System.out.println();


            /**
             * Erros: ("DEPOSITO, SAQUE, TRANSFERÊNCIA") da conta corrente estão OK!
             * Erros: ("DEPOSITO, SAQUE, TRANSFERÊNCIA") da conta Poupança estão OK!
             */


        }catch(CadastroInvalidoException|DepositoInvalidoException|SacarInvalidoException|
               TransferenciaInvalidoException e){
                   System.out.println("** " + e.getMessage() + " **");
               }        
    }

}
