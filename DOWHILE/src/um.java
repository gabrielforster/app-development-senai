import java.util.Scanner;

public class um {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite numero: ");
        int num = sc.nextInt();
        int i = 2;
        int divisoes = 0;
        do{
            if(num % i == 0){
                divisoes++;
            }
            i++;
        }while(i<num);

        if(divisoes == 0 ){
            System.out.println(num+" é um numero primo");
        }
        else {
            System.out.println(num + " não é numero primo");
        }

        sc.close();
    }
}