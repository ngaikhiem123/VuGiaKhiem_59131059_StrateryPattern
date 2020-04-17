/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author DELL
 */
public class Bt2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConText bieuThuc = new ConText();
        bieuThuc.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + bieuThuc.tinh(75,12));
        
        bieuThuc.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + bieuThuc.tinh(54,78));
    }
    
}
