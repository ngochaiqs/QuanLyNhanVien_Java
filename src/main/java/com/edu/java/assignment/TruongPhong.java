package com.edu.java.assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TruongPhong extends NhanVien{
    private double luongTrachNhiem;

    @Override
    public double getThuNhap() {
        return getLuong() + luongTrachNhiem;
    }

    public TruongPhong() {
        super("Trưởng Phòng");
    }
    public TruongPhong(String maNV, String hoTen, Double luong, double luongTrachNhiem) {
        super(maNV, hoTen, "Trưởng Phòng", luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhập lương trách nhiệm: ");
        luongTrachNhiem = sc.nextDouble();
        sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        DecimalFormat df = new DecimalFormat("###,###,###,###" + " VNĐ");
        System.out.println("Lương trách nhiệm: " + df.format(luongTrachNhiem));
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }
}
