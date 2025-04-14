public class Cliente {
    String nome;
    String cpf;
    Endereco endereco;


    String retornarDados () {
        String dados = "nome: " + nome + " " + "cpf: " + cpf + " " + "endereço: " + endereco;
        return dados;
    }

}
