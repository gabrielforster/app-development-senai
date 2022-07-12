import java.util.Scanner;

public class questao_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mesString = "";


        System.out.print("Dia: ");
        int dia = sc.nextInt();
        System.out.print("Mês: ");
        int mes = sc.nextInt();
        System.out.print("Ano: ");
        int ano = sc.nextInt();
        System.out.print("Hora: ");
        int hora = sc.nextInt();
        System.out.print("Minuto: ");
        int minuto = sc.nextInt();

        if(mes == 1){
            mesString = "Janeiro";
        }
        if(mes == 2){
            mesString = "Fevereiro";
        }
        if(mes == 3){
            mesString = "Março";
        }
        if(mes == 4){
            mesString = "Abril";
        }
        if(mes == 5){
            mesString = "Maio";
        }
        if(mes == 6){
            mesString = "Junho";
        }
        if(mes == 7){
            mesString = "Julho";
        }
        if(mes == 8){
            mesString = "Agosto";
        }
        if(mes == 9){
            mesString = "Setembro";
        }
        if(mes == 10){
            mesString = "Outubro";
        }
        if(mes == 11){
            mesString = "Novembro";
        }
        if(mes == 12){
            mesString = "Dezembro";
        }

        System.out.println(dia+" de "+mesString+" de "+ano + "\n" + hora+":"+minuto);

    }
}
