
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite o primeiro numero: ");
        numero1 = leitor.nextInt();

        System.out.println("Digite o segundo numero: ");
        numero2 = leitor.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior numero é o primeiro: " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("O maior numero é o segundo: " + numero2);
        } else {

            System.out.println("Os dois numeros sao iguais.");

            leitor.close();

        }
    }
}
