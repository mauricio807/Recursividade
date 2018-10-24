package Q3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauri
 */
public class Quest3Inverte {
     public static int invercao(int num, int inv){
        if(num==0){
            System.out.println(inv);
            return inv;
        }
        else{
            return invercao( num/10, inv * 10 + num % 10);
        }
    
    
}
}