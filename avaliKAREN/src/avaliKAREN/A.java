package avaliKAREN;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um n?mero: ");
	int num1 = sc.nextInt();
	
	System.out.println("Digite um segundo n?mero menor que o primeiro: ");
	int num2 = sc.nextInt();
	
	System.out.println("O resultado da subtra??o ?: " + (num1 - num2));
	
	sc.close();
	}
}