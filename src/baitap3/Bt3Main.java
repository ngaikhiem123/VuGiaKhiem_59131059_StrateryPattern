/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 *
 * @author DELL
 */
public class Bt3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // Khởi tạo
        DateFormat df = new SimpleDateFormat("dd-mm-yyyy");
        QLSV quanLy = new QLSV();
        SinhVien sv1 = new SinhVien("Vũ", df.parse("31-12-1999"), 10);
        SinhVien sv2 = new SinhVien("Gia", df.parse("14-05-1999"), 8);
        SinhVien sv3 = new SinhVien("Khiêm", df.parse("23-10-1999"), 9);
        SinhVien sv4 = new SinhVien("Vũ Gia Khiêm", df.parse("23-10-1999"), 2);
        SinhVien sv5 = new SinhVien("Anh", df.parse("23-10-1999"), 3);
        SinhVien sv6 = new SinhVien("Chiêu Anh", df.parse("23-10-1999"), 1);
        quanLy.themSV(sv1);
        quanLy.themSV(sv2);
        quanLy.themSV(sv3);
        quanLy.themSV(sv4);
        quanLy.themSV(sv5);
        quanLy.themSV(sv6);
        
        System.out.println("Danh sách sau khi nhập:");
        quanLy.inDS();
        
        //sắp xếp theo tên
        quanLy.setSoSanh(new SoSanhTheoTen());
        quanLy.sapXep();
        System.out.println("Sau khi sắp xếp theo tên");
        quanLy.inDS();
        
        //sắp xếp theo điểm
        quanLy.setSoSanh(new SoSanhTheoDiem());
        quanLy.sapXep();
        System.out.println("Sau khi sắp xếp theo điểm");
        quanLy.inDS();
        

    }
    
}
