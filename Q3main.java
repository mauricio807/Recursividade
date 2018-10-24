/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Q3main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o numero deseja inverter");
        int num = teclado.nextInt();
        Quest3Inverte q = new Quest3Inverte();
        q.invercao(num, 0);

    }

}
