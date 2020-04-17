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
public class HangHoa {
    private String tenHH;
    private int gia;
    private String mota;

    public HangHoa(String tenHH, int gia, String mota) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.mota = mota;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
            
    public String inHH(){
        return "Tên hàng hóa: " + tenHH +
               "\nGiá: " + gia +
               "\nMô tả: " + mota; 
    }
}
