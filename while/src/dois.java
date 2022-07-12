import java.util.Scanner;

public class dois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;

        while(num > 0){
            System.out.println("Numero: ");
            num = sc.nextInt();
            if(num<0) break;
            System.out.println("Numero: " + num + "\n" +
                    "Quadrado: "+ Math.pow(num,2) + "\n" +
                    "Cubo: " + Math.pow(num,3));
        }

        sc.close();
    }
}
