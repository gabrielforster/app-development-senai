import java.util.Scanner;

public class questao_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario;

        System.out.println("Menu de opções:\n" +
                "1. Imposto\n" +
                "2. Novo salário\n" +
                "3. Classificação\n" +
                "Digite a opção desejada.");
            int opcao = sc.nextInt();


        if(opcao == 1){
            System.out.println("Insira seu salário atual: ");
            salario = sc.nextDouble();

            if(salario < 500){
                System.out.println("Imposto a pagar: " + (salario * 0.05));
            } else
                if(salario <= 850) {
                    System.out.println("Imposto a pagar: " + (salario * 0.10));
                } else {
                    System.out.println("Imposto a pagar: " + (salario * 0.15));
                }
        } else
            if(opcao == 2){
                System.out.println("Insira seu salário atual: ");
               salario = sc.nextDouble();

                if(salario < 400){
                    salario = salario + 100;
                } else
                    if(salario < 750){
                        salario = salario + 75;
                    } else
                        if(salario < 1500){
                            salario = salario + 50;
                        } else {
                            salario = salario + 25;
                        }
                System.out.println("Seu novo salário será de: " + salario);
            } else
                if(opcao == 3){
                    System.out.println("Insira seu salário atual: ");
                    salario = sc.nextDouble();

                    if(salario <= 700){
                        System.out.println("Você é mal remunerado!");
                    } else {
                        System.out.println("Você é bem remunerado!");
                    }
                }
    }
}
