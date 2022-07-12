import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0, numDigitos=0, maior = 0, menor = 0, somaPares = 0, numPares = 0;

        while (true){
            System.out.println("Digite um numero: ");
            int digito = sc.nextInt();
            if(menor == 0){
                menor = digito;
            }
            if (digito == 30000){
                break;
            };
            soma += digito;
            numDigitos += 1;
            if(digito<menor) menor = digito;
            if(digito>maior) maior = digito;
            if(digito%2 == 0){
                numPares++;
                somaPares += digito;
            }
        }

        double porcentagemImpares = ((numDigitos-numPares)*100) / numDigitos;

        System.out.println("Soma: " + soma);
        System.out.println("Numero de digitos: " + numDigitos);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: "+ menor);
        System.out.println("Média de pares: " + (somaPares/numPares));
        System.out.println("Porcentagem de Impares: " + porcentagemImpares);

        sc.close();
    }
}
