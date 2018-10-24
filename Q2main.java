/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Q2main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Quest2Sequencia q = new Quest2Sequencia();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe quantos contem nesta sequencia");
        int n = teclado.nextInt();
        q.fib(n);
    }
        // TODO code application logic here
    }
    

