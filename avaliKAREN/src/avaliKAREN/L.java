package avaliKAREN;
import java.util.Scanner;

public class L {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do espetaculo: ");
		double valor = sc.nextDouble();
		
		System.out.println("Valor do ingresso: ");
		double ingresso = sc.nextDouble();
		
		int numIngressos = 0;
		while((ingresso*numIngressos)< valor ) {
			numIngressos++;
		}
		
		System.out.println("o numero de ingressos a ser vendidos deve ser: "+ numIngressos);
		
		sc.close();
	}

}
