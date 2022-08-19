import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int tab = entrada.nextInt();
        System.out.println("Digite o inicio da tab:");
        int init = entrada.nextInt();
        System.out.println("Digite o fim da tab:");
        int end = entrada.nextInt();

        if (init > end) {
            System.out.println("Valor informado inicial menor que o final ;-;");
        } else {
            for (int x = init; x <= end; x++) {
                System.out.println(tab + " x " + x + " = " + (tab * x));
            }
        }
    }
}
