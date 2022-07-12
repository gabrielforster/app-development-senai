import java.util.Scanner;

public class questao_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a opção desejada:\n" +
                "1. Somar dois números\n" +
                "2. Raiz quadrada de um número.\n" + ": ");
        int opcao = sc.nextInt();

        if(opcao == 1){
            System.out.print("Primeiro numero: ");
            double num1 = sc.nextDouble();
            System.out.println("+");
            System.out.print("Segundo numero: ");
            double num2 = sc.nextDouble();
            System.out.println("Resultado: " + (num1 + num2));
        } else {
            System.out.print("Insira um número: ");
            double num = sc.nextDouble();
            System.out.println(Math.sqrt(num));
        }
    }
}
