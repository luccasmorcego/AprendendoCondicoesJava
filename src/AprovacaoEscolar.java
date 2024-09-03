import java.util.Scanner;

public class AprovacaoEscolar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua média escolar: ");
        int média = sc.nextInt();

        if (média >= 7)
            System.out.println("Aprovado");
        else if (média >= 5 && média < 7)
            System.out.println("Recuperação");
        else if (média < 5)
            System.out.println("Reprovado");



    }
}