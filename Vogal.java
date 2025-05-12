import javax.swing.*;

public class Vogal {
    public static void main(String[] args) {

        //ler a palavra

        String palavra = JOptionPane.showInputDialog("digite uma palavra: ");

        String vogais = "aeiou";
        for (int i=0; i < vogais.length(); i++)

        //trocar as vogais por *
            palavra = palavra.replace(vogais.charAt(i), '*');


        //exibir palavra modificada
        JOptionPane.showMessageDialog(null, palavra);












    }
}
