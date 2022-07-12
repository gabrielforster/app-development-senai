package aula_01;
import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		System.out.println("O numero inserido foi: " + numero);
		
		sc.close();	
	}
}
