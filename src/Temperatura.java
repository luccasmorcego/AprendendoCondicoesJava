import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite graus celsius:");
        int celsius = scanner.nextInt();

        if (celsius > 30)
            System.out.println("Quente");
        else if (celsius >=15 && celsius <=30)
            System.out.println("Agradável");
        else if (celsius <15)
            System.out.println("Frio");

    }







}
