/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauri
 */
public class Quest1Fatorial {

    public static int fatorial(int num) {
        int x = 0;
        if (num == 0) {
            return 1;
        } else {
            x = x + (num * fatorial(num - 1));
        }
        System.out.println(x);
        return x;
    }

}
