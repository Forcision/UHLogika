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
public class UH5 {
    public static void main(String[] args) {
        int[] a = {4, 6, 1, 3, 5};
        System.out.println("Menentukan nilai  max  dan min");
        System.out.println("[4, 6, 1, 3, 5]");
        System.out.println("");
        int max=a[0];
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max){
                max = a[i];
            }else if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("nilai max = "+max);
        System.out.println("nilai min = "+min);
        System.out.println("=======================");
    }
    }
    


