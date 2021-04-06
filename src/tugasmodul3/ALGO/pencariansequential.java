/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul3.ALGO;

import java.util.Scanner;


/**
 *
 * @author ACER
 */
public class pencariansequential {
    public static void main(String[] args) {
    System.out.println("PENCARIAN SEQUENTIAL "+"\n");
        int data [] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int dicari;
        boolean ketemu =false;
        Scanner scan = new Scanner(System.in); 
        System.out.print("isi data adalah: ");
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    System.out.println("");
        System.out.println("");
        
        System.out.print("Masukan data yang dicari : ");
        dicari = scan.nextInt();
    
        for (int i = 0; i < data.length; i++){
        if (dicari == data[i]){
            ketemu = true;
            System.out.print("Data " + dicari +" berada pada index ke - " + i);
        }
        
            
    }
    System.out.println();
    
    if(ketemu == true){
        System.out.println("data ditemukan");
    }else{
        System.out.println("data tidak ditemukan");
              
                }
    System.out.println(" Sugeng Sulistianto ");
    }
    
}


