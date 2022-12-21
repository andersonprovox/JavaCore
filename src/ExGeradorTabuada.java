import java.util.Scanner;

public class ExGeradorTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número para criar a Tabuada: ");
        int numero = Integer.parseInt(sc.nextLine());

        System.out.println("Segue a tabuada do número " + numero);
        for (int i = 1; i <=10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }

    }
}
