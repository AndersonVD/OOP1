import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valor = input.nextDouble();
        System.out.println("Digite o valor do desconto: ");
        double desconto = input.nextDouble();
        System.out.println("Digite o valor do acrescimo: ");
        double acrescimo = input.nextDouble();
        double valorFinal = valor - (valor * (desconto / 100)) + (valor * (acrescimo / 100));
        System.out.println("O valor final é: " + valorFinal);
    }
}