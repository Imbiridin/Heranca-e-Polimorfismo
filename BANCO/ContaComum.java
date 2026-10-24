package BANCO;

import javax.swing.JOptionPane;

public class ContaComum extends Conta{
    private double taxaManutencao;

    public ContaComum(String titular, int numero, double taxaManutencao){
        super(titular, numero);
        this.taxaManutencao = taxaManutencao;
    }

    public void cobrarManutencao(){
        this.saldo -= taxaManutencao;
        JOptionPane.showMessageDialog(null,"Taxa de manutenção de R$" + taxaManutencao + " cobrada.");
    }

    public double getTaxaManutencao(){
        return taxaManutencao;
    }

}