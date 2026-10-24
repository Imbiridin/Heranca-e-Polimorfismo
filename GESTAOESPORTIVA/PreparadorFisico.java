package GESTAOESPORTIVA;

public class PreparadorFisico extends MembroComissao{

    private String focoTreinamento;

    public PreparadorFisico (String nomeP, String cpfP, double salarioP){
        super(nomeP, cpfP, salarioP);
    }

    public void mudarTreino(String treino){
        this.focoTreinamento = treino;
        this.exibirTreino();
    }

    public void exibirTreino(){
        System.out.println("Programação de Treino para hoje: " + this.focoTreinamento);
    }
}
