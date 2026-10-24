package BANCO;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
    
        JOptionPane.showMessageDialog(null, "Bem-vindo ao Banco Master");
        
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String numero_T = JOptionPane.showInputDialog("Informe o número da conta: ");
        int numeroConta = Integer.parseInt(numero_T);

        Conta ct = null; 

        boolean continuar = true;

        while(continuar){ 
            String menu = "";
            if (ct == null) {
                menu = "Crie sua conta:\n[1] CONTA COMUM | [2] CONTA ESPECIAL | [0] SAIR";
            } else {
                menu = "=== BANCO MASTER ===\n[1] SACAR | [2] DEPOSITAR | [3] SALDO | [0] SAIR";
            }

            String opcao_T = JOptionPane.showInputDialog(menu);
            if (opcao_T == null) break; 
            int opcao = Integer.parseInt(opcao_T);
            
            switch(opcao){
                case 1:
                    if (ct == null) {
                        
                        ct = new ContaComum(nome, numeroConta, 15.00);
                        JOptionPane.showMessageDialog(null, "Conta Comum criada com sucesso!");
                    } else {
                        
                        String saque_T = JOptionPane.showInputDialog("Digite o valor para sacar: ");
                        if (saque_T != null) ct.sacar(Double.parseDouble(saque_T));
                    }
                    break;
                    
                case 2:
                    if (ct == null) {
                        
                        ct = new ContaEspecial(nome, numeroConta, 15000);
                        JOptionPane.showMessageDialog(null, "Conta Especial criada com sucesso!");
                    } else {
                        
                        String deposito_T = JOptionPane.showInputDialog("Digite o valor para depositar: ");
                        if (deposito_T != null) ct.depositar(Double.parseDouble(deposito_T));
                    }
                    break;
                    
                case 3:
                    if (ct != null) {
                        ct.exibirDados();
                    }
                    break;
                
                case 0:
                    continuar = false;
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}