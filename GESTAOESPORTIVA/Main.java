package GESTAOESPORTIVA;

public class Main {
    
    public static void main(String[] args) {
        PreparadorFisico pf = new PreparadorFisico("Marcos", "12345678910", 50000);

        pf.exibirFicha();
        pf.mudarTreino("Cardio");
    }
}
