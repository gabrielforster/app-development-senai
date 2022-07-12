import java.util.Scanner;

public class um {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu salário: ");
        double carlos = sc.nextDouble();
        double joao = carlos/3;
        int i = 0;

        while(joao < carlos){
            carlos = carlos + (carlos*0.02);
            joao = joao + (joao*0.05);

            i++;
        }

        System.out.println("Será necessário " + i + " meses");

        sc.close();
    }
}
