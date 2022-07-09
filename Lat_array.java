/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat_array;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lat_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int input;
    int array1 []= {3,6,2,7,8,4,2,6,7,9,1};
    int array2 []= new int[11];
    int array3 [][]= new int [10][10];
    int z;
    int jumlah1 = 0;
    int jumlah2 = 0;
    int jumlah3;
    //array1
        System.out.println("---------Tampilan array 1---------");
        for (z=0;z<=10;z++)
        {
            System.out.println("["+z+"]"+ "="+array1[z] );
        }
        System.out.print("Nilai array1 adalah :");
        for(int a:array1)
        {
            System.out.print("["+a+"]");
        }
        System.out.println();
        System.out.println();
        
        //array2
        System.out.println("---------Masukan array---------");
        Scanner n = new Scanner (System.in);
        for (z=0;z<=10;z++)
        {
         System.out.println("array 2 ["+z+"] = ");
         array2[z] = n.nextInt(); 
        }
        System.out.print("nilai array2 adalah : ");
        for(int j : array2)
        {
            System.out.print(j+",");
        }
        System.out.println(".");
        System.out.println();
        System.out.println();
        

        //method 2d/array 3
        System.out.println("Penggabungan antar array1 dan array2 menjadi 2d = ");
        for (z=0;z<10;z++){
        for(z=0;z<array1.length;z++)
        {
                System.out.print("["+array1[z]+"]");
                System.out.print("["+array2[z]+"]");
                System.out.println();
        }
        }
        System.out.println();
        System.out.println();
        
        //penjumlahan array
        System.out.println("---------Penjumlahan array1 dan array 2---------");
        System.out.println("Total dari array 1 adalah = ");
        for (int total : array1)
        {
            jumlah1 = jumlah1 +total;
        }
        System.out.println(jumlah1);
        System.out.println("Total dari array 2 adalah = ");
        for (int total : array2)
        {
           jumlah2 = jumlah2 +total;
        }
        System.out.print(jumlah2);
        System.out.println();
        jumlah3 = jumlah1+jumlah2;
        System.out.println("Total penjumlahan dari array 1 dan 2 adalah : "+jumlah3);
    }
}

