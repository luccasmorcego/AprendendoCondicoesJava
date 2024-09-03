import java.util.Scanner;

public class ClassificacaoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um temperatura em Celsius: ");
        int temperatura = sc.nextInt();

        if (temperatura > 30)
            System.out.println("Quente");
        else if (temperatura >= 15 &&temperatura <= 30)
        System.out.println("Agradável");
        else if (temperatura < 15);
        System.out.println("Frio");}
}





