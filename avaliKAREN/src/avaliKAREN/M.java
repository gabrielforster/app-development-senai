package avaliKAREN;
import java.util.Scanner;

public class M {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do salario minimo: ");
		double salario = sc.nextDouble();
		
		System.out.println("Quantidade de quilowatts: ");
		double quilos = sc.nextDouble();
		
		double valorQuilos =  quilos*(salario/5);
		
		System.out.println("O valor de cada quilwatt: " + salario/5);
		System.out.println("O valor a ser pago no final do mes: " + valorQuilos);
		System.out.println("O valor a ser pago com desconto: " + valorQuilos*0.85);
		
		
		sc.close();
	}

}
