package avaliKAREN;
import java.util.Scanner;


public class I {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de horas trabalhadas: ");
		double horasTrab = sc.nextDouble();
		
		System.out.println("Digite o valor de um salario minimo: ");
		double salarioMin = sc.nextDouble();
		
		System.out.println("Digite suas horas extras; ");
		double extras = sc.nextDouble();
		
		double salarioBruto = horasTrab*(salarioMin/8);
		double valorExtras = extras*(salarioMin/4);
		
		System.out.println("Seu salario final é de: " + (salarioBruto+valorExtras));
		
		sc.close();

	}

}
