/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4overidding;

/**
 *
 * @author LENOVO
 */
public class hitungjava2 {
    public static void main(String[]args){
        Latihan4overidding lat4 = new Latihan4overidding();
        
        persegi persg = new persegi();
        persg.sisi =8;
        
        persegipanjang panjang = new persegipanjang();
        panjang.lebar=11;
        panjang.panjang=2;
        
        lat4.luas();
        lat4.keliling();
        
        persg.keliling();
        persg.luas();
        
        panjang.keliling();
        panjang.luas();
    }
}
        
        
    

