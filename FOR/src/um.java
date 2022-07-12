import java.util.Scanner;
public class um {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiplicador, numero;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            multiplicador = numero * i;
            System.out.println(numero + " x " + i + " = " + multiplicador);
        }
    }
}

