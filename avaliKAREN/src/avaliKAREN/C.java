package avaliKAREN;
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um n�mero: ");
	int num1 = sc.nextInt();
	
	System.out.println("Digite outro n�mero: ");
	int num2 = sc.nextInt();
	
	System.out.println("O resultado da divis�o �: " + (num1/num2));
	
	sc.close();
	}
}