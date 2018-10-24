/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q5;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Q5main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor que voce quer somar de 1 até ele");
        int n = teclado.nextInt();
        Quest5Somatoria q = new Quest5Somatoria();
        q.somInt(n,0);
    }   
}
