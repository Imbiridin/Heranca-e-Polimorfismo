package GESTAOESPORTIVA;

public class MembroComissao{
    protected String nome;
    protected String cpf;
    protected double salario;

    public MembroComissao(String nomeC, String cpfC, double salarioC){
        this.nome = nomeC;
        this.cpf = cpfC;
        this.salario = salarioC;
    }

    public void exibirFicha(){
        System.out.println("Colaborador (" + this.cpf + ") " + this.nome);
        System.out.println("Salario: R$" + this.salario);
    }
}