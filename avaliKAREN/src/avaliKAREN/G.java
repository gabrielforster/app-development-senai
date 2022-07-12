package avaliKAREN;
import java.util.Scanner;

public class G {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero para saber a tabuada dele: ");
		int num = sc.nextInt();
		
		for(int x = 0; x <= 10; x++) {
			System.out.println(num+" x "+x+" = "+num*x);
		}
		
		sc.close();
	}

}
