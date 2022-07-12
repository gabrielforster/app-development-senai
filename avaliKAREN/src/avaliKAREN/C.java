package avaliKAREN;
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um número: ");
	int num1 = sc.nextInt();
	
	System.out.println("Digite outro número: ");
	int num2 = sc.nextInt();
	
	System.out.println("O resultado da divisão é: " + (num1/num2));
	
	sc.close();
	}
}