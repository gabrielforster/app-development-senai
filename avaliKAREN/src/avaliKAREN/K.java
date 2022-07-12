package avaliKAREN;
import java.util.Scanner;

public class K {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma hora: ");
		int horas = sc.nextInt();
		System.out.println("Digite os minutos: ");
		int minutos = sc.nextInt();
		
		System.out.println("A hora digitada em minutos: "+ horas*60);
		int totalMinutos = minutos+(horas*60);
		System.out.println("O total de minutos é: "+ totalMinutos);
		
		System.out.println("O total de minutos em segundos é: "+ totalMinutos*60);
		
		sc.close();
	}

}
