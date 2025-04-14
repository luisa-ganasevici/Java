public class ContaCorrente {

    double saldo;
    Cliente titular;


    void depositar(double valor) {

        saldo = saldo + valor;
        //pode ser += ou = saldo + valor
    }
    void retirar(double valor) {

        saldo -= valor;
    }

    double retornarSaldo() {

        return saldo;
    }


}
