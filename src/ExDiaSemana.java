import java.util.Scanner;

public class ExDiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("informe de um a 7 para verificar o dia da semana: ");
        int numeroSelecionado = Integer.parseInt(sc.nextLine());

        switch (numeroSelecionado){
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Dia inválido");
        };


    }
}
