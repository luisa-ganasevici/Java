import java.util.Scanner;

public class ClientePrincipal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Cliente cliente = new Cliente();



        System.out.println("nome do cliente: ");
        cliente.nome = ler.next() + ler.nextLine();

        System.out.println("digite seu id: ");
        cliente.id = ler.next() + ler.nextLine();

        System.out.println("Pergunta de segurança! qual seu cpf?");
        cliente.cpf = ler.next() + ler.nextLine();


        System.out.println("seu saldo é: ");
        cliente.saldo = ler.nextDouble();


        int opcao = 0;
        String menu = """
                Digite a opção:
                
                1 - Ver saldo
                2 - Realizar transação 
                3 - Receber transação
                4 - Sair
                
                """;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = ler.nextInt();
        }
            if (opcao == 1) {
    System.out.println(" sei saldo é: " + cliente.saldo);
}
        else if (opcao == 2) {
                System.out.println("qual codigo de conta deseja transferir? ");
}


    }
}
