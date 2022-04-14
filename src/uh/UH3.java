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
public class UH3 {
    public static void main(String[] args) {
        int a,b,c,d,e,hasil;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama : ");
        a = scan.nextInt();
        
        System.out.print("Masukkan angka kedua : ");
        b = scan.nextInt();
        
        System.out.print("Masukkan angka ketiga : ");
        c = scan.nextInt();
        
        System.out.print("Masukkan angka keempat : ");
        d = scan.nextInt();
        
        System.out.print("Masukkan angka kelima : ");
        e = scan.nextInt();
        
        hasil = a+b+c+d+e;
        
        System.out.println("Hasil dari angka " +a+"+"+b+"+"+c+"+"+d+"+"+e+ " tersebut adalah "+hasil);
    }
}
