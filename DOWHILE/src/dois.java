import java.util.Scanner;

public class dois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countCidade = 0, codigo, numVeiculos, acidentes, somaVeiculos = 0, somaVeiculosMenos = 0,
                cidadeMenos = 0, maior = 0, menor = 24715871, somaAcidentes = 0, codeMenor = 0, codeMaior = 0;

        do {
            System.out.println("Digite o codigo da cidade: ");
            codigo = sc.nextInt();
            System.out.println("Números veiculos passeio: ");
            numVeiculos = sc.nextInt();
            System.out.println("Número acidentes: ");
            acidentes = sc.nextInt();

            if (numVeiculos < 2000) {
                cidadeMenos++;
                somaVeiculosMenos += acidentes;
            }
            if (acidentes < menor) {
                codeMenor = codigo;
                menor = acidentes;
            }
            if (acidentes > maior) {
                codeMaior = codigo;
                maior = acidentes;
            }
            somaAcidentes += acidentes;
            somaVeiculos += numVeiculos;
            countCidade++;
        } while (countCidade <= 4);

        System.out.println("Code cidade: " + codeMaior +  " Maior indice de acidente: " + (maior * 100)/somaAcidentes);
        System.out.println("Code cidade: " + codeMenor + " Menor indice de acidente: " + (menor * 100)/somaAcidentes);
        System.out.println("Média de veiculos das cidades: " + (somaVeiculos / 5));
        System.out.println("Média de acidentes de transito com cidades com menos de 2000 veiculos: " + (somaVeiculosMenos / cidadeMenos));

        sc.close();
    }
}