/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonnaci;
import java.util.Scanner;
/**
 *
 * @author Praktikan
 */
public class Fibonnaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Masukkan batas angka : ");
        a = in.nextInt();
        b = 1;
        c = 0;
        d = 0;
        for (int i = 1; i <= a; i++) {
            System.out.print(c + " ");
            d = d + c;
            c = c + b;
            b = c - b;
        }
        System.out.println("Hasil Penjumlahan : " + d);
    }
}
