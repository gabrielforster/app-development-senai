import java.util.Scanner;

public class questao_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double aumento = 0, novoSalario = 0;
        String cargo = "";
        System.out.println("Escrituário: 1 \n" +
                "Secretário: 2\n" +
                "Caixa: 3\n" +
                "Gerente: 4\n" +
                "Diretor: 5\n");
        System.out.println("Insira o código: ");
        int codigo = sc.nextInt();
        System.out.println("Salário atual: ");
        double salario = sc.nextDouble();


        if(codigo == 1){
            cargo = "Escriturário";
            novoSalario = salario * 1.5;
            aumento = novoSalario - salario;
        } else
        if(codigo == 2){
            cargo = "Secretário";
            novoSalario = salario * 1.35;
            aumento = novoSalario - salario;
        } else
        if(codigo == 3){
            cargo = "Caixa";
            novoSalario = salario * 1.2;
            aumento = novoSalario - salario;
        } else
        if(codigo == 4){
            cargo = "Gerente";
            novoSalario = salario * 1.1;
            aumento = novoSalario - salario;
        } else
        if(codigo == 5){
            cargo = "Diretor";
            System.out.println("Diretores não possuem aumento");
        }

        System.out.println("Cargo: " + cargo + "\nAumento: " + aumento + "\nNovo salário: " + novoSalario);


    }
}
