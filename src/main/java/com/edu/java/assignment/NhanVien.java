package com.edu.java.assignment;

import java.util.Scanner;

public class ThemNhanVien {
    String maNV;
    String hoTen;
    Double luong;

    public void nhap(){
        System.out.println("Nhập mã nhân viên: ");
        maNV = new Scanner(System.in).nextLine();
        System.out.println("Nhập họ tên nhân viên: ");
        hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhập lương nhân viên: ");
        luong = new Scanner(System.in).nextDouble();
    }

}
