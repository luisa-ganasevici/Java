import java.util.Scanner;

public class parte5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1;
        System.out.println("digite seu numero: ");
        n1 = ler.nextDouble();

        if (n1 >= 0) {
            System.out.println("seu numero é positivo!");
        } else {
            System.out.println("seu numero é negativo!");
        }


        int n2;
        int n3;
        System.out.println("digite o numero 2: ");
        n2 = ler.nextInt();
        System.out.println("digite o numero 3");
        n3 = ler.nextInt();

        if (n2 == n3) {
            System.out.println("seus numeros são iguais!");

        } else {
            System.out.println("seus numeros são diferentes!");
        }

if (n2 >= n3) {
    System.out.println("o segundo numero é maior que o terceiro!");
}
        else {
    System.out.println("o numero tres é maior que o numero dois!");
}

        }
    }

