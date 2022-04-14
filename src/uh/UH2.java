/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uh;
import java.util.*;
/**
 *
 * @author penjo
 */
public class UH2 {
    public static void main(String[] args) {
        int angka;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Masukkan angkanya : ");
    angka = scan.nextInt();
    
    if(angka % 2 ==0){
        System.out.println("Bilangan "+angka+ "adalah genap");
    }else{
        System.out.println("Bilangan "+angka+"adalah ganjil");
    }
    }
}
