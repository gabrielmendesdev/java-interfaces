import javax.swing.JOptionPane;

public class NotaAluno implements Avaliacao {

    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite a nota do aluno (0 a 10):");
        
        if (entrada == null) {
            return;
        }
        
        try {
            double nota = Double.parseDouble(entrada);

            if (nota >= 9.0) {
                JOptionPane.showMessageDialog(null, "Nota: " + nota + "\n" + EXCELENCIA);
            } else if (nota >= 6.0) {
                JOptionPane.showMessageDialog(null, "Nota: " + nota + "\n" + SATISFATORIO);
            } else {
                JOptionPane.showMessageDialog(null, "Nota: " + nota + "\n" + REPROVADO);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Digite um número decimal.");
        }
    }
}