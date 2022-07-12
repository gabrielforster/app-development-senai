package avaliKAREN;
import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Peso do saco em quilos: ");
        double peso = sc.nextDouble()*1000;
        
        System.out.println("Quantidade para o gatos em gramas: ");
        double gatos = sc.nextDouble();
        
        double sacoQuintoDia = (gatos*2)*5;
       
        if(peso > sacoQuintoDia) {
            System.out.println("Restou: " + (peso - sacoQuintoDia) + "KG");
        } else if(peso < sacoQuintoDia){
            System.out.println("Falou ração no saco!");
        }else {
        	System.out.println("Não restou nada !");
        }
        sc.close();
    }
}