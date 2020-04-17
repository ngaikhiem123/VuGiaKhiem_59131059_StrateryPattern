/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author DELL
 */
public class Bt2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Khởi tạo
        GioHang gh1 = new GioHang();
        GioHang gh2 = new GioHang();
        
        gh1.setHinhThucTT(new ThanhToanOnline());
        gh2.setHinhThucTT(new ThanhToanCOD());
        
        HangHoa hh1 = new HangHoa("Táo", 1500000, "ngon");
        HangHoa hh2 = new HangHoa("Lê", 3000000, "bổ");
        HangHoa hh3 = new HangHoa("Xoài", 300000, "rẻ");
        //giỏ hàng 1
        gh1.themHH(hh1);
        gh1.themHH(hh2);
    
        System.out.println("Giỏ hàng thứ 1:\nDanh sách hàng hóa: ");
        gh1.inDSHH();    
        System.out.println("Tiền hàng : " + gh1.tinhTienHang() + 
                           "\nSố tiền khách phải trả: " + gh1.thanhToan() + "\n");                   
        //giỏ hàng 2
        gh2.themHH(hh2);
        gh2.themHH(hh3);
        
        System.out.println("Giỏ hàng thứ 2:\nDanh sách hàng hóa: ");
        gh2.inDSHH();    
        System.out.println("Tiền hàng : " + gh2.tinhTienHang() + 
                           "\nSố tiền khách phải trả: " + gh2.thanhToan());   
    }
    
}
