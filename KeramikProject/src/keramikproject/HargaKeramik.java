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
public class HargaKeramik {
    //atribut
    int panjang;
    int lebar;
    int harga;
    int jlhPcs;
    
    //methods
    void hitungHarga(){
        int hargaTotal;
        int luasBangunan = 1000000;
        hargaTotal = luasBangunan / (this.panjang * this.lebar * this.jlhPcs) * this.harga;
        System.out.println("Harga Total Keramik : Rp. " + hargaTotal);
    }
}
