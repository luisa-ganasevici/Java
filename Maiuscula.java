import javax.swing.*;
import java.util.Scanner;

public class Maiuscula {
    public static void main(String[] args) {

        String palavra = JOptionPane.showInputDialog("digite uma palvra: ");

        //transformar em maiusculo

        String novaPalavra = palavra.toUpperCase();

        System.out.println(novaPalavra);

        System.out.println("");


    }
}
