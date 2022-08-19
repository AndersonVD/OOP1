import java.util.Scanner;

public class Validade {
    public static void main(String[] args) {
        int num = -1;

        // do {
        // Scanner entrada = new Scanner(System.in);
        // System.out.println("Digite o numero: ");
        // } while (num < 0);
        while (num < 0) {
            System.out.println("Digite um numero maior que 0: ");
            num = entrada.nextInt();
        }
        entrada.close();
    }
}
