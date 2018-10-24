package Q2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mauri
 */
public class Quest2Sequencia {

    int x = 0;

    public int fib(int num) {
        if (num == 0) {
            System.out.println(x);
            return x;
        } else {
            if (num == 1) {
                return 1;
            } else {
                return x = fib(num - 1) + fib(num - 2);

            }
        }
    }

}
