package avaliKAREN;
import java.util.Scanner;

public class E {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite seu sal�rio: ");
	double salario = sc.nextDouble();
	
	System.out.println("Digite o valor de suas vendas: ");
	double vendas = sc.nextDouble();
	
	double comissao = vendas*0.04;
	double salarioFinal = salario + comissao;
	
	System.out.println("Sua comiss�o �: " + comissao + "\n"
	+ "Seu sal�rio final �: "+ salarioFinal);
	
	sc.close();
	}
}