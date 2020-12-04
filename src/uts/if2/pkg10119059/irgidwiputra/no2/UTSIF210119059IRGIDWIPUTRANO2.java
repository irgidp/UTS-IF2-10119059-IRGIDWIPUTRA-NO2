/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : UTS Tabungan
 */
package uts.if2.pkg10119059.irgidwiputra.no2;

import java.util.Scanner;
/**
 *
 * @author Corazon
 */
public class UTSIF210119059IRGIDWIPUTRANO2 {

    public static void main(String[] args) {
        int jumlah;
        Scanner input = new Scanner(System.in);
        
        System.out.println("==== Program Penarikan Uang ====");
        System.out.print("Masukkan Saldo Awl : ");
        Tabungan objTab = new Tabungan(input.nextInt());
        
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = objTab.ambilUang(input.nextInt());
        
        System.out.println("Saldo Anda Sekarang : "+jumlah);
    }
    
}
