package avaliKAREN;
import java.util.Scanner;

public class H {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu salario: ");
		double salario = sc.nextDouble();
		
		System.out.println("Qual o valor da primeira conta: ");
		double conta1 = sc.nextDouble();
		
		System.out.println("Qual o valor da segunda conta: ");
		double conta2 = sc.nextDouble();
		
		double restoSalario = salario - ((conta1*1.02) + (conta2*1.02));
		
		System.out.println("O que sobrou do seu salario foi: "+ restoSalario);
	
		sc.close();
	}

}
