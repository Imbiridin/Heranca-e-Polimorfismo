package BANCO;

import javax.swing.JOptionPane;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(String titular, int numero, double limite){
        super(titular, numero);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor){
        if(valor > 0 && valor <= this.saldo + this.limite){
            this.saldo -= valor;
            JOptionPane.showMessageDialog(null,"Saque de R$" + valor + " realizado (com limite)");
            return true;
        }
        JOptionPane.showMessageDialog(null,"Saldo insuficiente!");
        return false;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        JOptionPane.showMessageDialog(null,"Limite: R$" + this.limite);
    }

    public double getLimite(){
        return limite;
    }
}
