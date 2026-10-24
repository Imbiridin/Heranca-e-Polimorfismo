package FINANCEIRO;
public class PagamentoCartao extends Pagamento {
    private int numParcelas;

    public PagamentoCartao(double valor, int numParcelas){
        super(valor);
        this.numParcelas = numParcelas;
    }

    @Override
    public double calcularTaxa(){
        return 5.00 + (this.valor * 0.02);
    }
}
