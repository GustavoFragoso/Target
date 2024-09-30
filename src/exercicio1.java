import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
        int numeroInformado = scanner.nextInt();


        int a = 0;
        int b = 1;
        boolean pertence = false;


        while (a <= numeroInformado) {
            if (a == numeroInformado) {
                pertence = true;
                break;
            }
            int proximo = a + b;
            a = b;
            b = proximo;
        }


        if (pertence) {
            System.out.println("O número " + numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroInformado + " não pertence à sequência de Fibonacci.");
        }
    }
}
