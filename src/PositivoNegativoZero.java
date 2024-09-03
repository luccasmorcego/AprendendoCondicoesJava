import java.util.Scanner;

public class PositivoNegativoZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();

        if (numero >0)
            System.out.println("Positivo");
        else if (numero < 0)
            System.out.println("Negativo");
        else if (numero == 0)
            System.out.println("Zero (0)");
    }
}