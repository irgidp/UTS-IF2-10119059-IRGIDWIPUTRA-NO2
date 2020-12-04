/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : UTS Tabungan
 */
package uts.if2.pkg10119059.irgidwiputra.no2;
/**
 *
 * @author Corazon
 */
public class Tabungan {
    
    private int saldo;
    
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah){
        return saldo - jumlah;
    }
}
