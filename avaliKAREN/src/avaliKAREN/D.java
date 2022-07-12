package avaliKAREN;
import java.util.Scanner;

public class D {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um número: ");
	int produto = sc.nextInt();
	
	System.out.println("Seu produto com desconto tem o preço: : " + (produto * 0.9));
	
	sc.close();
	}
}