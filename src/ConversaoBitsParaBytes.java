import java.util.Scanner;

public class ConversaoBitsParaBytes {

    public static final int BITS_EM_UM_BYTE = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de bits (long): ");
        long numeroDeBits = scanner.nextLong();

        if (numeroDeBits >= 0 && numeroDeBits <= Long.MAX_VALUE) {

            if (numeroDeBits % BITS_EM_UM_BYTE == 0) {
               
                long numeroDeBytes = numeroDeBits / BITS_EM_UM_BYTE;
                System.out.println("Número de bytes: " + numeroDeBytes);
            } else {
                System.out.println("O número de bits deve ser múltiplo de " + BITS_EM_UM_BYTE + ".");
            }
        } else {
            System.out.println("Por favor, insira um número de bits válido (positivo e até " + Long.MAX_VALUE + ").");
        }

        scanner.close();
    }
}

