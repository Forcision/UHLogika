/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uh;

import java.util.Scanner;

/**
 *
 * @author penjo
 */
public class UH4 {
    public static void main(String[] args) {
        
        int[] angka = {4,5,7,8,3};
        
        System.out.println("Menentukan bilangan ganjil dan genap");
        System.out.println("==============BILANGAN==============");
        System.out.println("[4, 6, 1, 3 , 5]");
        
        System.out.print("=> [");
        for(int a=0; a<5; a++){
            if(angka[a] %2 ==0){
                System.out.print("Genap, ");
            }else{
                System.out.print("Ganjil,");
        }
        
    }
        System.out.println("]");
}
}
