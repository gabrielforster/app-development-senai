package avaliKAREN;
import java.util.Scanner;

public class F {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor de sum salario minimo : ");
	double salarioMinimo = sc.nextDouble();
	
	System.out.println("Digite seu sal�rio: ");
	double salario = sc.nextDouble();
	
	System.out.println("Voc� ganha: " + (salario/salarioMinimo)+ " salarios minimos!");
	
	sc.close();
	}
}