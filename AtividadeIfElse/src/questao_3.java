import java.util.Scanner;

public class questao_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeira data: ");
        System.out.print("Dia: ");
        int dia1 = sc.nextInt();
        System.out.print("Mês: ");
        int mes1 = sc.nextInt();
        System.out.print("Ano: ");
        int ano1 = sc.nextInt();
        int totalDias1 = (ano1 * 365) + (mes1 * 30) + dia1;

        System.out.println("Segunda data: ");
        System.out.print("Dia: ");
        int dia2 = sc.nextInt();
        System.out.print("Mês: ");
        int mes2 = sc.nextInt();
        System.out.print("Ano: ");
        int ano2 = sc.nextInt();
        int totalDias2 = (ano2 * 365) + (mes2 * 30) + dia2;

        if(totalDias1 < totalDias2){
            System.out.println(dia1 + "/" + mes1 + "/" + ano1 + " Vem antes");
        } else if(totalDias2 < totalDias1){
            System.out.println(dia2 + "/" + mes2 + "/" + ano2 + " Vem antes");
        } else {
            System.out.println("As datas são iguais.");
        }
    }
}
