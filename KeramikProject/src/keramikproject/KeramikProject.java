/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keramikproject;

/**
 *
 * @author acer
 */
public class KeramikProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HargaKeramik a = new HargaKeramik();
        a.panjang = 30;
        a.lebar = 30;
        a.harga = 54000;
        a.jlhPcs = 10;
        a.hitungHarga();
        
        HargaKeramik b = new HargaKeramik();
        b.panjang = 40;
        b.lebar = 40;
        b.harga = 65000;
        b.jlhPcs = 5;
        b.hitungHarga();
        
        HargaKeramik c = new HargaKeramik();
        c.panjang = 30;
        c.lebar = 40;
        c.harga = 60000;
        c.jlhPcs = 8;
        c.hitungHarga();
    }
    
}
