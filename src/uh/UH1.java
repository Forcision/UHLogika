/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uh;
import java.util.*;

public class UH1 {


    public static void main(String[] args) {
        
        int pertama,kedua,terbesar = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama : ");
        pertama = scan.nextInt();
        
        System.out.print("Masukkan bilangan kedua : ");
        kedua = scan.nextInt();
        
        if(pertama>kedua){
            terbesar=pertama;
        }else{
            if(kedua>pertama){
                terbesar=kedua;
            }
        }
        System.out.println("Bilangan terbesar adalah : "+terbesar);
        }
    
  
}
