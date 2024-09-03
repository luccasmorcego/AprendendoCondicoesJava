import java.util.Scanner;
public class atividade10 {

    public static double descontar(double num, double desconto){

        return (num - (num * desconto));}

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Insira o valor total da sua compra: ");
            double totalCompra = input.nextDouble();
            double desconto = 0;
            double valorFinal = 0;

            if (totalCompra >= 500) {
                desconto = 0.2;
                valorFinal = descontar(totalCompra, desconto);

            } else if (totalCompra >= 200) {
                desconto = 0.1;
                valorFinal = descontar(totalCompra, desconto);

            } else if (totalCompra >= 100) {
                desconto = 0.05;
                valorFinal = descontar(totalCompra, desconto);

            } else if (totalCompra < 100) {
                valorFinal = totalCompra;
            }

            System.out.println("Valor original da compra: " + totalCompra);
            System.out.println("% do desconto: " + desconto);
            System.out.println("Valor descontado: " + totalCompra * desconto);
            System.out.println("Valor final da compra: " + valorFinal);

        }
    }

