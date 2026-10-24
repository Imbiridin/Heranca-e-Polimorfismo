package BANCO;

import javax.swing.JOptionPane;

public class Conta{
    protected String titular;
    protected int numero;
    protected double saldo;


    public Conta(String titular, int numero){
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        if(valor >=0){
            this.saldo += valor;
            JOptionPane.showMessageDialog(null,"Depósito de R$" + valor + " realizado ");
        }
    }

    public boolean sacar(double valor){
        if (valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            JOptionPane.showMessageDialog(null,"Saque de R$" + valor + " realizado ");
            return true;
        }
        JOptionPane.showMessageDialog(null,"Saldo insuficiente");
        return false;
    }

    public void exibirDados(){
        JOptionPane.showMessageDialog(null,"Titular: " + this.titular);
        JOptionPane.showMessageDialog(null,"Conta nº: " + this.numero);
        JOptionPane.showMessageDialog(null,"Saldo: R$" + this.saldo);
    }

    public double getSaldo(){
        return saldo;
    }

    public String getTitular(){
        return titular;
    }


}