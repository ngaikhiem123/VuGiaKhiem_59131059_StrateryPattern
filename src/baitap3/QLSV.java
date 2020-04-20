/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class QLSV {
    List<SinhVien> dssv;
    ISoSanh<SinhVien> soSanh;

    public QLSV() {
        dssv = new ArrayList<>();
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    
    public void themSV(SinhVien sv){
        dssv.add(sv);
    }
    
    public void inDS(){
        System.out.println(String.format("%-20s %-20s %s", "Họ và tên: ", "Ngày Sinh", "Điểm trung bình"));
        for (int i = 0; i < dssv.size(); i++){
            System.out.println(dssv.get(i).inTT());
        }
    }
    
    public void sapXep(){
        dssv.sort((sv1, sv2) -> {   
            return soSanh.soSanh(sv1, sv2); //To change body of generated lambdas, choose Tools | Templates.
        });
    }
}
