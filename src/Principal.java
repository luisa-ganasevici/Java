import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        Endereco endereco = new Endereco();
        Cliente cliente = new Cliente();
        ContaCorrente contaCorrente = new ContaCorrente();


        System.out.println("Digite o logradouro: ");
        endereco.logradouro = ler.nextLine();

        System.out.println("digite o numero: ");
        endereco.numero = ler.nextShort();
        ler.nextLine();

        System.out.println("Complemento: ");
        endereco.complemento = ler.nextLine();

        System.out.println("digite o cep: ");
        endereco.cep = ler.nextLine();

        System.out.println("******************************************");

        System.out.println("info do cliente!");

        System.out.println("Digite o nome:");
        cliente.nome = ler.nextLine();

        System.out.println("digite o cpf:");
        cliente.cpf = ler.nextLine();

        cliente.endereco = endereco;

        System.out.println("******************************************");

        System.out.println("saldo!");

        System.out.println("digite seu saldo inicial: ");
        contaCorrente.saldo = ler.nextDouble();

        contaCorrente.titular = cliente;



        System.out.println("valor a depositar: ");

        //criando outra variavel para facilidar a soma dos dados (saldo)

        double saldoADepositar = ler.nextDouble();

        contaCorrente.depositar(saldoADepositar);

        System.out.println("novo saldo: " + contaCorrente.retornarSaldo());



        System.out.println("valor a retirar: ");

        //criando variavel para subtrair

        double saldoARetirar = ler.nextDouble();

        contaCorrente.retirar(saldoARetirar);

        System.out.println("novo saldo: " + contaCorrente.retornarSaldo());

        System.out.println("******************************************");
        System.out.println("dado do cliente: ");

        System.out.println(cliente.retornarDados());

        System.out.println(endereco.retornarEndereco());

        System.out.println("********************************************");


    }
}
