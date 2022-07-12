package avaliKAREN;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um número: ");
	int num1 = sc.nextInt();
	
	System.out.println("Digite um segundo número menor que o primeiro: ");
	int num2 = sc.nextInt();
	
	System.out.println("O resultado da subtração é: " + (num1 - num2));
	
	sc.close();
	}
}