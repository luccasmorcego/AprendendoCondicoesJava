import java.util.Scanner;

public class ClassificacaoNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua nota:");
    int nota = scanner.nextInt();

    if (nota >= 9)
        System.out.println("Excelente");
    else if (nota >= 7)
        System.out.println("Bom");
    else if (nota >= 5)
        System.out.println("Satisfatório");
    else if (nota <= 5)
        System.out.println("Insatisfatório");{

    }
    }
}
