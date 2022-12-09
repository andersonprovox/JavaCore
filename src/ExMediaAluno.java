import java.util.Scanner;

public class ExMediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notasAluno = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Insira a nota " + (i + 1) + " do aluno: ");
            notasAluno[i] = Double.parseDouble(sc.nextLine());
        }
        somarNotas(notasAluno);
    }

    public static void somarNotas(double[] notas){
        Double somaDasNotas = 0.0;

        for (int i = 0; i < notas.length; i++) {
            somaDasNotas += notas[i];
        }

        System.out.println("O Resultado da média das notas do aluno é:" + somaDasNotas / notas.length);
    }
}
