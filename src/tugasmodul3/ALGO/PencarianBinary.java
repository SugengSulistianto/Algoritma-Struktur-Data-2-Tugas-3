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
public class PencarianBinary {
    public static void main(String[] args) {
    System.out.println("PENCARIAN BINARY "+"\n");
        int data [] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int dicari;
        int indeksawal = 0;
        int indeksakhir = data.length - 1;
        boolean ketemu = false;
        int tengah = 0;
        Scanner scan = new Scanner(System.in);
        
         System.out.print("isi data adalah: ");
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
               
        }
        System.out.println("");
        System.out.println("");
        
        System.out.print("Masukan data yang dicari : ");
        dicari = scan.nextInt();
        
        while((indeksawal <= indeksakhir) && (!ketemu)) {
        tengah = (indeksawal + indeksakhir) / 2;
        
        if(data[tengah] == dicari){
            ketemu = true;
            
         } else if (dicari <= data[tengah]) {
                System.out.println("Cari di kiri");
                indeksakhir = tengah-1;
                
                
        } else {
                System.out.println("Cari di Kanan");
                indeksawal = tengah+1;
         
               
            }
        } 
        if(ketemu){
            System.out.println("Data " +
            dicari + " Telah ditemukan pada indeks ke " +
            (tengah + " baris ke " + (tengah + 1)));
        }else{
            System.out.println("Data " + dicari 
            + " Tidak ditemukan");
        }
        System.out.println("\n");
        System.out.println(" Sugeng Sulistianto ");
    }
}



