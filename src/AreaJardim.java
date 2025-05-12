import javax.swing.JOptionPane;

public class AreaJardim {
    public static void main(String[] args) {
        // Entrada de dados
        String larguraStr = JOptionPane.showInputDialog("Digite a largura do jardim (em metros):");
        String comprimentoStr = JOptionPane.showInputDialog("Digite o comprimento do jardim (em metros):");
        
        // Conversão para double
        double largura = Double.parseDouble(larguraStr);
        double comprimento = Double.parseDouble(comprimentoStr);
        
        // Cálculo da área
        double area = largura * comprimento;
        
        // Exibição do resultado
        String mensagem = "A área do jardim é: " + area + " metros quadrados.";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}