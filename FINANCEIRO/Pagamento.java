package FINANCEIRO;

import javax.swing.JOptionPane;

public abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor){
        this.valor = valor;
    }

    public void exibirRecibo(){
        double taxa = calcularTaxa();
        double valorFinal = this.valor + taxa;

        String recibo = String.format(
            "--- RECIBO ---\n" +
            "Valor original: R$ %.2f\n" +
            "Taxa aplicada: R$ %.2f\n" +
            "Valor Final: R$ %.2f",
            this.valor, taxa, valorFinal
        );

        JOptionPane.showMessageDialog(null, recibo);
    }

    public abstract double calcularTaxa();
}