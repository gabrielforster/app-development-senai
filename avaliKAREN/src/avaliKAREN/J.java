package avaliKAREN;
import java.util.Scanner;

public class J {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor que voce possui para viajar: ");
		double grana = sc.nextDouble();
		
		double granaDolar = grana/4.97;
		double granaEuro = grana/5.23;
		double granaLibra = grana/6.25;
		
		System.out.printf("Seu dinheiro em Dolar vale: %.2f", granaDolar);
		System.out.printf("\nSeu dinheiro em Euro: %.2f", granaEuro);
		System.out.printf("\nSeu dinheiro em Libras: %.2f", granaLibra);
		
		
		sc.close();
	}

}
