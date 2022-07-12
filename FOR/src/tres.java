import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, pecasMes, codigoMaioralario = 0, manCounter=0, womenCounter=0, totalPieces = 0;
        String gender;
        double totalPayroll = 0, avgMenPieces=0, avgWomenPieces=0, minimumWage, wage, higherSalaryEmployee = 0;


        System.out.println("Inform the minimum wage: ");
        minimumWage = sc.nextDouble();

        for (int i = 1; i <= 15; i++){
            System.out.println("Inform your codigo: ");
            codigo = sc.nextInt();

            System.out.println("Month pieces made: ");
            pecasMes = sc.nextInt();

            System.out.println("Inform your gender ('men', 'women'): ");
            gender = sc.next();

            if(pecasMes <= 30){
                wage = minimumWage;
            } else if(pecasMes <= 50){
                wage = minimumWage + ((minimumWage * 0.03) * (pecasMes-30));
            } else {
                wage = minimumWage + ((minimumWage * 0.05) * (pecasMes-30));
            }

            if(i == 1){
                higherSalaryEmployee = wage;
                codigoMaioralario = codigo;
            } else {
                if(wage > higherSalaryEmployee){
                    higherSalaryEmployee = wage;
                    codigoMaioralario = codigo;
                }
            }

            if(gender.equals("men")){
                manCounter++;
                avgMenPieces += pecasMes;
            } else {
                womenCounter++;
                avgWomenPieces += pecasMes;
            }

            totalPayroll += wage;
            totalPieces += pecasMes;

            System.out.println("------------");
            System.out.println("Employee codigo: " + codigo);
            System.out.println("Wage: " + wage);
        }

        System.out.println("Total payroll: " + totalPayroll);
        System.out.println("Total pieces produced: " + totalPieces);
        System.out.println("Average man's pieces produced: " + (avgMenPieces / manCounter));
        System.out.println("Average woman's pieces produced: " + (avgWomenPieces / womenCounter));

        System.out.println("Employee of the month (higher wage):");
        System.out.println("Code: " + codigoMaioralario);

    }
}