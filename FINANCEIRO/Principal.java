package FINANCEIRO;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Pagamento> listaPagamentos = new ArrayList<>();
        
        PagamentoCartao pg1 = new PagamentoCartao(50, 10);
        PagamentoCartao pg2 = new PagamentoCartao(100, 12);
        PagamentoBoleto pg3 = new PagamentoBoleto(300);

        listaPagamentos.add(pg1);
        listaPagamentos.add(pg2);
        listaPagamentos.add(pg3);

        for (Pagamento pgto : listaPagamentos) {
            

            pgto.exibirRecibo();
        }
    }
}

