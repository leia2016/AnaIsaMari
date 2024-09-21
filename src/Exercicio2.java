import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {
        double total = 0;
        int qtdNotas = 3;

        for (int i = 1; i <= qtdNotas; i++) {
            String input = JOptionPane.showInputDialog("Digite a nota " + i + ":");
            if (input == null || input.isEmpty() || !input.matches("-?\\d+(\\.\\d+)?")) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Programa será encerrado.");
                System.exit(0);
            }
            total += Double.parseDouble(input);
        }
        JOptionPane.showMessageDialog(null, String.format("A média das notas é: %.2f", total / qtdNotas));
    }
}