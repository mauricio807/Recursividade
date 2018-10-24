
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauri
 */
public class Q1main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Quest1Fatorial q = new Quest1Fatorial();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o Valor do numero que deseja o fatorial");
        int num = teclado.nextInt();
        q.fatorial(num);
    }

}
