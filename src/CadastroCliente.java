import javax.swing.JOptionPane;

public class CadastroCliente {
    public static void main(String[] args) {
        // Entrada de dados
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
        String endereco = JOptionPane.showInputDialog("Digite o endereço do cliente:");
        
        // Exibição dos dados
        String mensagem = "Cadastro realizado!\n\nNome: " + nome + "\nEndereço: " + endereco;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}