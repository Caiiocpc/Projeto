package br.com.treinaweb.projeto.classes;

import br.com.treinaweb.projeto.excecoes.DepositoInvalidoException;
import br.com.treinaweb.projeto.excecoes.SacarInvalidoException;
import br.com.treinaweb.projeto.excecoes.TransferenciaInvalidoException;

public class ContaPoupanca extends Conta{
    protected double saldo;
    private String numeroContaPoupanca;
    private double rendimento = 0.005;

    public ContaPoupanca(String numeroContaPoupanca, double valor){
        if(valor > 0){
            this.numeroContaPoupanca = numeroContaPoupanca;
            this.saldo += valor + (valor * rendimento);
        }else{
            System.out.println("Erro.");
        }        
    }

    public void deposito(double valor) throws Exception{
        if(valor > 0){
            this.saldo += valor;
        }else{
            throw new DepositoInvalidoException();
        }        
    }

    public void sacar(double valor) throws Exception{
        if(this.saldo >= valor){
            this.saldo -= valor;
        }else{
            throw new SacarInvalidoException();
        }         
    }

    public void transferencia(Conta conta, double valor)throws Exception{
        if(this.saldo >= valor){
            this.saldo -= valor;
            conta.deposito(valor);
        }else{
            throw new TransferenciaInvalidoException();
        }

    }

    public String getNumeroContaPoupanca(){
        return this.numeroContaPoupanca;
    }    
}
