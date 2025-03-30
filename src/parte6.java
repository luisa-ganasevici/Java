import java.util.Scanner;

public class parte6 {
    public static void main(String[] args) {

        String nome = "Deanerys Targerian";
        String tipoConta = "corrente";
        double saldo = 100000.00;
        int opçao = 0;

        System.out.println("******************************************************");
        System.out.println("\n Nome do cliente: " + nome);
        System.out.println("tipo de conta: " + tipoConta);
        System.out.println(" Saldo: " + saldo);
        System.out.println("\n******************************************************");

        String menu = """
                ** Digite sua opção **
                
                1- consultar saldo
                2- Realizar pix
                3- Receber pix
                4- Sair 
                """;
        Scanner ler = new Scanner(System.in);


        while (opçao != 4) {
            System.out.println(menu);
            opçao = ler.nextInt();

            if (opçao == 2) {
                double n1;
                System.out.println("digite a chave pix");
                String chavePix = ler.next();

                System.out.println("Digite o quanto quer pagar: ");
                n1 = ler.nextDouble();
                if (n1 > saldo)
                    System.out.println("valor não suficiente!");
                saldo = saldo - n1;
                System.out.println("Seu saldo pós a transação:" + saldo);

            } else {
                if (opçao == 1) {
                    System.out.println("seu saldo é: " + saldo);

                } else { if (opçao == 3) {
                    int suaChave = 994186114;

                    System.out.println("sua chave pix é: " + suaChave);
                    System.out.println("valor recebido: ");
                    double valor = ler.nextDouble();
                    saldo = saldo + valor;
                    System.out.println(saldo);
                } else { if (opçao != 4) {
                    System.out.println("opção invalida!");
                }

                }

                }


                }

            }


        }
    }

