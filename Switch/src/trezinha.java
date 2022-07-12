import java.util.Scanner;

public class trezinha {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Quantidade de livros: ");
        int quantidade = sc.nextInt();

        double criterioA = (0.25 * quantidade) + 7.5;
        double criterioB = (0.50 * quantidade) + 2.5;

        if(criterioA < criterioB){
            System.out.println("o melhor criterio é o: criterio A");
        }
        else if(criterioA == criterioB){
            System.out.println("Os valores ficam iguais com os dois criterios");
        }
        else System.out.println("O citrerio B é melhor");
        sc.close();
    }
}
