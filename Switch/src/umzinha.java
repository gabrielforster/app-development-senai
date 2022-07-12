import java.util.Scanner;

public class umzinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double reajustado, reajuste;

        System.out.println("Digite o código do seu cargo: \n" +
                "1 - Escrituário\n" +
                "2 - Secretário\n" +
                "3 - Caixa\n" +
                "4 - Gerente\n" +
                "5 - Diretor");
        int cargo = sc.nextInt();

        System.out.println("Digite seu salário: ");
        double salario = sc.nextDouble();

        switch (cargo){
            case 1:
                reajustado = salario * 1.5;
                reajuste = salario * .5;
                break;
            case 2:
                reajustado = salario * 1.35;
                reajuste = salario * .35;
                break;
            case 3:
                reajustado = salario * 1.2;
                reajuste = salario * .2;
                break;
            case 4:
                reajustado = salario * 1.1;
                reajuste = salario * .1;
                break;
            default:
                reajustado = salario;
                reajuste = 0;
                break;
        }

        System.out.println("Seu cargo:"+  cargo + "\nSalário reajustado: "+ reajustado +"\nSeu aumento foi de:" + reajuste);

        sc.close();
    }
}
