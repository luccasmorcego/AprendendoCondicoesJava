import java.util.Scanner;

public class atividade11 {

    public static double bonus(double num, double percent) {
        return (num * percent);
    }

    public static double calc_imposto(double num, double taxa) {
        return (num * taxa);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o sálario bruto do funcionário: ");
        double salarioBruto = input.nextDouble();

        System.out.println("Quantos anos o funcionário trabalhou na empresa: ");
        int anosTrabalhados = input.nextInt();

        double bonus = 0;
        double taxa = 0;

        if (anosTrabalhados >= 10) {
            //bonus de 10%
            double bonusP = 0.1;
            bonus = bonus(salarioBruto, bonusP);

        } else if (anosTrabalhados >= 5) {
            ///bonus de 5%
            double bonusP = 0.05;
            bonus = bonus(salarioBruto, bonusP);

        } else if (anosTrabalhados < 5) {
            // sem bonus
            double bonusP = 0;
            bonus = bonus(salarioBruto, bonusP);
        }

        if (salarioBruto >= 5000) {
            // 27% de imposto
            double imposto_pct = 0.27;
            taxa = calc_imposto(salarioBruto, imposto_pct);

        } else if (salarioBruto >= 3000) {
            // 18% de imposto
            double imposto_pct = 0.18;
            taxa = calc_imposto(salarioBruto, imposto_pct);

        } else if (salarioBruto < 3000) {
            // 10% de imposto
            double imposto_pct = 0.10;
            taxa = calc_imposto(salarioBruto, imposto_pct);
        }

        double salarioLiquido = (salarioBruto + bonus) - taxa;

        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Bonus recebido: " + bonus);
        System.out.println("Imposto descontado: " + taxa);
        System.out.println("Salario liquido: " + salarioLiquido);

    }
}
