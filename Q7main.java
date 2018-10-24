/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q7;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Q7main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o numero");
        int n = teclado.nextInt();
        System.out.println("Informe o Digito que deseja verificar");
        int num = teclado.nextInt();
        Quest7Digito q = new Quest7Digito();
        q.dig(n, num, 0);
    }
}
