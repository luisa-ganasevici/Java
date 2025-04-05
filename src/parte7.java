import java.util.Scanner;

public class parte7 {
    public static void main(String[] args) {

        int opçao = 0;

        String menu = """
                escolha uma opçao:
                
                1 - luisa
                2 - ana
                3 - chris
                4 - mauro
                5- sair
                """;
        Scanner ler = new Scanner(System.in);

        while (opçao != 5) {
            System.out.println(menu);
            opçao = ler.nextInt();
        }
        if (opçao == 1){
            System.out.println("x :)" + 1);


        }
        else {
            if (opçao == 2) {
                System.out.println("y :)");
                opçao = ler.nextInt();
            }
        }

    }
}
