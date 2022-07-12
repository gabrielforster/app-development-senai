import java.util.Scanner;

public class doizinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, preco = 0, valorImposto = 0;
        System.out.println("Digite o código do pais: ");
        int pais = sc.nextInt();
        System.out.println("Digite o código do produto: ");
        int produto = sc.nextInt();
        System.out.println("Digite o peso do produto: ");
        double pesoQuilos = sc.nextDouble();
        peso = pesoQuilos * 1000;
        if(produto >= 1 && produto <=4){
            preco = peso * 10;
        } else if(produto >= 5 && produto <=7){
            preco = peso * 25;
        } else if(produto >= 8 && produto <=10){
            preco = peso * 35;
        } else{
            System.out.println("Codigo de produto informado invalido");
        }
        switch (pais) {
            case 1:
                valorImposto = 0;
                break;
            case 2:
                valorImposto = preco * .15;
                break;
            case 3:
                valorImposto = preco * .25;
                break;
            default:
                System.out.println("codigo do pais invalido"); }
        System.out.println("Peso do produto comprado: " + peso +
                "\nPreço do produto: " + preco +
                "\n Valor do imposto: " + valorImposto +
                "\n Preço total do produto: " + (valorImposto+preco));
        sc.close();
    }
}
