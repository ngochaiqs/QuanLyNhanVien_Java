package com.edu.java.assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NhanVienTiepThi extends NhanVien{
    private Double doanhSo;
    private Double hoaHong;

    @Override
    public double getThuNhap() {
        return getLuong() + doanhSo * hoaHong/100;
    }

    public NhanVienTiepThi() {
        super("Tiếp Thị");
    }

    public NhanVienTiepThi(String maNV, String hoTen, Double luong, Double doanhSo, Double hoaHong) {
        super(maNV, hoTen, "Tiếp Thị", luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhập doanh số: ");
        doanhSo = sc.nextDouble();
        System.out.print("Nhập hoa hồng: ");
        hoaHong = sc.nextDouble();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        DecimalFormat df = new DecimalFormat("###,###,###,###" + " VNĐ");
        System.out.println("Doanh số: " + df.format(doanhSo));
        System.out.println("Hoa hồng: " + hoaHong + "%");
    }

    public Double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(Double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public Double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(Double hoaHong) {
        this.hoaHong = hoaHong;
    }
}
