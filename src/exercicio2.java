import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva uma Palavra ou frase para saber quantas letras A tem nela");
        String palavra = scanner.nextLine();
        int quantA =0;
        Pattern pattern = Pattern.compile("[aA]");
        Matcher m = pattern.matcher(palavra);
        while (m.find()){
            quantA++;

        }
        System.out.println(quantA);


    }
}
