/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q7;

/**
 *
 * @author mauri
 */
public class Quest7Digito {
     public static int dig(int num, int numx, int cont){
        if(num==0){
            System.out.println("O numero " + numx + " aparece " + cont +" vezes!");
            return cont;
        }
        else{
            if(numx == (num%10)){
                cont++;
            }
            num = num /10;
            return dig(num,numx,cont);
        }
    }
    
}
