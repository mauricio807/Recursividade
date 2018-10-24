/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

/**
 *
 * @author mauri
 */
public class Quest4SomaVetor {
    public static int somavetor(int x[], int num){
        if(num==1){
            return x[0];
        }
        else
            return somavetor(x,num-1) + x[num-1];
    }
    
}
