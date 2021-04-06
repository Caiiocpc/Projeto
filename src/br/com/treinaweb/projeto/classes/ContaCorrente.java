package br.com.treinaweb.projeto.classes;

import br.com.treinaweb.projeto.excecoes.DepositoInvalidoException;
import br.com.treinaweb.projeto.excecoes.SacarInvalidoException;
import br.com.treinaweb.projeto.excecoes.TransferenciaInvalidoException;

public class ContaCorrente extends Conta {
    private String numeroContaCorrente;
    protected double saldo;
    private double taxa = 10;

    public ContaCorrente(String numeroContaCorrente, double valor)throws Exception{
        if(valor > 0){
            this.numeroContaCorrente = numeroContaCorrente;
            this.saldo += (valor - taxa);
        }else{
            throw new Exception();
        }     
    }

    public void sacar(double valor)throws Exception{
        if(this.saldo >= valor){
            this.saldo -= valor;
        }else{
            throw new SacarInvalidoException();
        }
    }

    public void deposito(double valor)throws Exception{
        if(valor > 0){
            this.saldo += valor;
        }else{
            throw new DepositoInvalidoException();
        }        
    }

    public void transferencia(Conta conta, double valor) throws Exception{
        if(this.saldo >= valor){
            this.saldo -= valor;
            conta.deposito(valor); // throw new TransferenciaInvalidoException();
        }else{
            throw new TransferenciaInvalidoException();
        }
              
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getNumeroContaCorrente(){
        return this.numeroContaCorrente;
    }
}
