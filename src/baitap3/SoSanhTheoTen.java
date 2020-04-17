/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;


public class SoSanhTheoTen implements ISoSanh<SinhVien> {

    @Override
    public int soSanh(SinhVien a, SinhVien b) {
        String s1 = a.getHoTen();
        String s2 = b.getHoTen();
        int lmin = Math.min(s1.length(), s2.length());
        
        for (int i = 0; i < lmin; i++){
            if (s1.charAt(i) > s2.charAt(i)) return 1;
            else if (s1.charAt(i) < s2.charAt(i)) return -1;
        }
        
        if (s1.length() > s2.length()) return 1; else 
            if (s1.length() == s2.length()) return 0; else return -1;
    }
    
}
