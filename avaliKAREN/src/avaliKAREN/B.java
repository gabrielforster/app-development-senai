
package avaliKAREN;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um n�mero: ");
	int num1 = sc.nextInt();
	
	System.out.println("Digite outro n�mero: ");
	int num2 = sc.nextInt();
	
	System.out.println("Digite mais um n�mero: ");
	int num3 = sc.nextInt();
	
	System.out.println("O resultado �: " + (num1*num2*num3));
	
	sc.close();
	}
}
