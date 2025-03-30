import java.util.Scanner;

public class parte4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliaçao = 0;
        double nota = 0;



        for (int i = 0; i < 3 ; i++) {
            System.out.println("qual a sua avaliação? ");
            nota = leitura.nextDouble();
            mediaAvaliaçao = mediaAvaliaçao + nota;
        }

        System.out.println("media de avaliações: " +mediaAvaliaçao/3);



    }
}
