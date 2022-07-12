import java.util.Scanner;

public class questao_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o horário de início do jogo: \n" +
                "Hora: ");
        int horaI = sc.nextInt();
        System.out.println("Minuto: ");
        int minutoI = sc.nextInt();
        System.out.println("Insira o horário de término do jogo: \n" +
                "Hora: ");
        int horaT = sc.nextInt();
        System.out.println("Minuto: ");
        int minutoT = sc.nextInt();


        int duracaoHora = horaT - horaI;
        int duracaoMinuto = minutoT - minutoI;
        System.out.println(duracaoHora + " " + duracaoMinuto);

        if(duracaoHora < 0){
            duracaoHora = 24 + duracaoHora;
        }
        if(duracaoMinuto < 0){
            duracaoHora = duracaoHora - 1;
            duracaoMinuto = 60 + duracaoMinuto;
        }

        System.out.println(duracaoHora + " " + duracaoMinuto);
        System.out.println("Duração da partida: " + duracaoHora + ":" + duracaoMinuto);

    }
}
