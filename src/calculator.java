import java.util.Scanner;

public class calculator{

    public static double soma(double num1, double num2){
        return (num1 + num2);
    }

    public static double subtracao(double num1, double num2){
        return (num1 - num2);
    }

    public static double divisao(double num1, double num2){
        return (num1 / num2);
    }

    public static double multiplicacao(double num1, double num2){
        return (num1 * num2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro Número: ");
        double primeiroNumero = input.nextDouble();

        System.out.println("Insira o segundo Número: ");
        double segundoNumero = input.nextDouble();

        System.out.println("""
                Insira o simbolo da operação entre os dois números:
                 +: Adição
                 -: Subtração
                 *: Multiplicação
                 /: Divisão
                 Sua escolha: 
                """);
        String operacao = input.next();


        if (operacao.equals("+")){
            System.out.println(primeiroNumero + " " + operacao + " " + segundoNumero + " = " + soma(primeiroNumero, segundoNumero) );
        } else if (operacao.equals("-")) {
            System.out.println(primeiroNumero + " " + operacao + " " + segundoNumero + " = " + subtracao(primeiroNumero, segundoNumero));
        } else if (operacao.equals("*")) {
            System.out.println(primeiroNumero + " " + operacao + " " + segundoNumero + " = " + multiplicacao(primeiroNumero, segundoNumero));
        } else if (operacao.equals("/")) {
            System.out.println(primeiroNumero + " " + operacao + " " + segundoNumero + " = " + divisao(primeiroNumero, segundoNumero));
        }else{
            System.out.println("algo deu errado");
        }

    }
}
