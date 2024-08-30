import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String UserName = "user";
        String Senha = "admin";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu UserName:");
        String UserNameDigitado = scanner.nextLine();
        System.out.println("Digite sua Senha:");
        String SenhaDigitado = scanner.nextLine();

        if (UserName.equals(UserNameDigitado) && Senha.equals(SenhaDigitado)) {
            System.out.println("Login efetuado");
        }else {
            System.out.println("Login inválido");
        }
    }
}
