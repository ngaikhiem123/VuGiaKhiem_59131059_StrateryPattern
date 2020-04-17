/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class GioHang {
    List<HangHoa> dsHangHoa;
    IThanhToan hinhThucTT;

    public GioHang() {
        dsHangHoa = new ArrayList<>();
    }

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    
    public void themHH(HangHoa hh){
        dsHangHoa.add(hh);
    }
    
    public int tinhTienHang(){
        int tienHang = 0;
        for (int i = 0; i < dsHangHoa.size(); i++){
            tienHang += dsHangHoa.get(i).getGia();
        }
        return tienHang;
    }
    
    public double thanhToan(){
        return hinhThucTT.thanhToan(tinhTienHang());
    }
    
    public void inDSHH(){
        for (int i = 0; i < dsHangHoa.size(); i++){
            System.out.println("Hàng hóa thứ " + (i + 1) + ":\n" + dsHangHoa.get(i).inHH());
        }
    }
}
