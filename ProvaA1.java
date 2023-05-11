import java.util.Scanner;

public class ProvaA1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int anoBissexto;

        System.out.println("Digite um ano: ");
        anoBissexto = scanner.nextInt();

        if (anoBissexto % 4 == 0 && anoBissexto % 100 != 0 || anoBissexto % 400 == 0) {

            System.out.println("O ano informado é Bissexto!!!");
        } else {
            System.out.println("O ano informado não é Bissexto!!!");
        }

        scanner.close();

    }

}
