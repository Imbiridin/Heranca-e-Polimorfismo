package FINANCEIRO;

public class PagamentoBoleto extends Pagamento {
    public PagamentoBoleto(double valor){
        super(valor);
    }

    @Override
    public double calcularTaxa(){
        return 0.80;
    }
}
