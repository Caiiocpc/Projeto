package br.com.treinaweb.projeto.classes;

import br.com.treinaweb.projeto.excecoes.SacarInvalidoException;
import br.com.treinaweb.projeto.excecoes.TransferenciaInvalidoException;

public class Conta {
    private Cliente cliente;
    private Endereco endereco;
    private String agencia = "0001";
    private ContaCorrente numeroContaCorrente;
    private ContaPoupanca numeroContaPoupanca;

    public void contaBancaria(Cliente cliente, 
                              Endereco endereco,
                              ContaCorrente numeroContaCorrente,
                              ContaPoupanca numeroContaPoupanca){
        this.cliente = cliente;
        this.endereco = endereco;
        this.numeroContaCorrente = numeroContaCorrente;
        this.numeroContaPoupanca = numeroContaPoupanca;
    }

    public void deposito(double valor) throws Exception{
        this.numeroContaCorrente.saldo += valor;
    }

    public void sacar(Conta numeroConta, double valor) throws Exception{
        if(this.numeroContaCorrente.saldo == valor){
        }else{
            throw new SacarInvalidoException();
        }
    }

    public void transferencia(Conta conta, double valor) throws Exception{
        if(this.numeroContaCorrente.saldo == valor){
        }else{
            throw new TransferenciaInvalidoException();
        }
    }

    public String exibirContaBancaria(){
        String dados ="";
        dados += cliente.exibirDados() + "\n";
        dados += endereco.getEndereco() + "\n";
        dados += "Agência: " + this.agencia + "\n";
        dados += "Conta Corrente: " + this.numeroContaCorrente.getNumeroContaCorrente()  + "\n";
        dados += "Saldo: " + String.format("%.2f", this.numeroContaCorrente.saldo)  + "\n";
        dados += "Conta Poupança: " + this.numeroContaPoupanca.getNumeroContaPoupanca() + "\n";
        dados += "Saldo: " + String.format("%.2f", this.numeroContaPoupanca.saldo) + "\n";
        return dados;
    }
        

}
