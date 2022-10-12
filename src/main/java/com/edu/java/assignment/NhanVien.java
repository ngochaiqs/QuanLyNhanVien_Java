package com.edu.java.assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public abstract class NhanVien {
    //Thuộc tính
    String maNV;
    String hoTen;
    String loaiNV;
    Double luong;

    public abstract double getThuNhap();
    //Hàm khởi tạo không tham số
    public NhanVien() {
    }

    public NhanVien(String loaiNV) {
        this.loaiNV = loaiNV;
    }

    //Hàm khởi tạo có tham số
    public NhanVien(String maNV, String hoTen, String loaiNV, Double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.loaiNV = loaiNV;
        this.luong = luong;
    }

    //Hàm nhập thông tin nhân viên
    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhập mã nhân viên: ");
        maNV = sc.nextLine();
        System.out.print("Nhập họ tên nhân viên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập lương nhân viên: ");
        luong = sc.nextDouble();
        sc.nextLine();
    }
    //Hàm hiển thị thông tin nhân viên
    public void hienThiThongTin() {
        DecimalFormat df = new DecimalFormat("###,###,###,###" + " VNĐ");
        System.out.println("Mã nhân viên: " + maNV);
        System.out.println("Loại nhân viên: " + loaiNV);
        System.out.println("Họ tên nhân viên: " + hoTen);
        System.out.println("Lương nhân viên: " + df.format(luong));
        System.out.println("Thu nhập: " + df.format(getThuNhap()));
        System.out.println("--------------------------------");
    }

    //Hàm getter

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLoaiNV() {
        return loaiNV;
    }

    public void setLoaiNV(String loaiNV) {
        this.loaiNV = loaiNV;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }
}
