import java.util.Scanner;

public class parte3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

            System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
            System.out.println("seu filme favorito é: " +filme);

            System.out.println("qual o ano de lançamento? ");
        int anoLançamento = leitura.nextInt();
            System.out.println(anoLançamento);

            System.out.println("qual a sua avaliação? ");
        double avaliaçao = leitura.nextDouble();
        System.out.println(avaliaçao);



    }
}
