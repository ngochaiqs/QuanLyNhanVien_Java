package com.edu.java.assignment;

public class NhanVienHanhChinh extends NhanVien{

    @Override
    public double getThuNhap() {
        return getLuong();
    }

    public NhanVienHanhChinh() {
        super("Hành Chính");
    }

    public NhanVienHanhChinh(String maNV, String hoTen, Double luong) {
        super(maNV, hoTen, "Hành Chính", luong);
    }
}
