package com.edu.java.assignment;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        //Khai báo đối tượng quản lý nhân viên
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            menu();
            System.out.print("Chọn chức năng: ");
            choice = new java.util.Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Thêm nhân viên");
                    qlnv.nhapDanhSach(sc);
                    break;
                case 2:
                    System.out.println("Hiển thị danh sách nhân viên");
                    qlnv.hienThiDanhSach();
                    break;
                case 3:
                    System.out.println("Tìm kiếm nhân viên theo mã");
                    qlnv.timKiemNhanVien();
                    break;
                case 4:
                    System.out.println("Xóa nhân viên theo mã");
                    qlnv.xoaNhanVien();
                    break;
                case 5:
                    System.out.println("Cập nhật thông tin nhân viên theo mã");
                    qlnv.capNhatNhanVien();
                    break;
                case 6:
                    System.out.println("Tìm các nhân viên theo khoảng lương");
                    qlnv.timKiemTheoLuong();
                    break;
                case 7:
                    System.out.println("Sắp xếp nhân viên theo họ và tên");
                    qlnv.sapXepTheoHoTen();
                    break;
                case 8:
                    System.out.println("Sắp xếp theo thu nhập");
                    qlnv.sapXepTheoLuong();
                    break;
                case 9:
                    System.out.println("Xuất 5 nhân viên có thu nhập cao nhất");
                    qlnv.xuat5NhanVienCoLuongCaoNhat();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng không tồn tại");
            }
        } while (choice != 10);
    }

    // Tạo menu chọn chức năng
    public static void menu() {
        System.out.println("1. Thêm mới nhân viên");
        System.out.println("2. Hiển thị danh sách nhân viên");
        System.out.println("3. Tìm kiếm nhân viên");
        System.out.println("4. Xóa nhân viên");
        System.out.println("5. Cập nhật thông tin nhân viên");
        System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím");
        System.out.println("7. Sắp xếp nhân viên theo họ và tên");
        System.out.println("8. Sắp xếp nhân viên theo thu nhập");
        System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
        System.out.println("10. Thoát");
    }
}

