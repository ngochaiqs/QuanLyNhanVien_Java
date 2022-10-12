package com.edu.java.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyNhanVien{
    //Thuộc tính
        public ArrayList<NhanVien> nhanVien;

        //Phương thức
        public QuanLyNhanVien() {
            nhanVien = new ArrayList(10);
        }

        //Hàm thêm nhân viên vào danh sách
        public void themNhanVien(NhanVien nv) {
            nhanVien.add(nv);
        }

        //Hàm nhập danh sách nhân viên
        public void nhapDanhSach(Scanner sc){
            do {
                System.out.println("Nhập loại nhân viên: ");
                System.out.println("1. Nhân viên hành chính");
                System.out.println("2. Nhân viên tiếp thị");
                System.out.println("3. Trưởng phòng");
                System.out.print("Nhập lựa chọn: ");
                String chon = sc.nextLine();
                if (chon == null || chon.equals(""))
                   break;
                int ichon = Integer.parseInt(chon);
                switch (ichon) {
                    case 1:
                        NhanVienHanhChinh nvHC = new NhanVienHanhChinh();
                        nvHC.nhapThongTin(sc);
                        nhanVien.add(nvHC);
                        break;
                    case 2:
                        NhanVienTiepThi nvTT = new NhanVienTiepThi();
                        nvTT.nhapThongTin(sc);
                        nhanVien.add(nvTT);
                        break;
                    case 3:
                        TruongPhong tp = new TruongPhong();
                        tp.nhapThongTin(sc);
                        nhanVien.add(tp);
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Chức năng không tồn tại");
                }
            } while (true);
        }


//            System.out.println("Nhập số lượng nhân viên: ");
//            int n = sc.nextInt();
//            for(int i = 0; i < n; i++){
//                NhanVien nv = new NhanVien();
//                nv.nhapThongTin(sc);
//                System.out.println("Thêm nhân viên thành công!");
//                System.out.println("Nhập thông tin nhân viên thứ " + (i + 1));
//                themNhanVien(nv);
//
//            }
//        }

        //Hàm hiển thị danh sách nhân viên
        public void hienThiDanhSach(){
            System.out.println("Danh sách nhân viên: ");
            for (NhanVien nv : nhanVien) {
                if (nv instanceof NhanVienHanhChinh){
                    ((NhanVienHanhChinh) nv).hienThiThongTin();
                } else if (nv instanceof NhanVienTiepThi){
                    ((NhanVienTiepThi) nv).hienThiThongTin();
                } else if (nv instanceof TruongPhong){
                    ((TruongPhong) nv).hienThiThongTin();
                }
            }
        }

        //Hàm tìm kiếm nhân viên theo mã
        public void timKiemNhanVien() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập mã nhân viên cần tìm: ");
            String maNV = sc.nextLine();
            for (int i = 0; i < nhanVien.size(); i++) {
                NhanVien nv = (NhanVien) nhanVien.get(i);
                if (nv.getMaNV().equals(maNV)) {
                    nv.hienThiThongTin();
                    return;
                }
            }
            System.out.println("Không tìm thấy nhân viên có mã " + maNV);
        }

        //Hàm xoá nhân viên theo mã
        public void xoaNhanVien() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập mã nhân viên cần xóa: ");
            String maNV = sc.nextLine();
            for (int i = 0; i < nhanVien.size(); i++) {
                NhanVien nv = (NhanVien) nhanVien.get(i);
                if (nv.getMaNV().equals(maNV)) {
                    nhanVien.remove(i);
                    System.out.println("Đã xóa nhân viên có mã " + maNV);
                    return;
                }
            }
            System.out.println("Không tìm thấy nhân viên có mã " + maNV);
        }

        //Hàm cập nhật thông tin nhân viên theo mã nhân viên
        public void capNhatNhanVien() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập mã nhân viên cần cập nhật: ");
            String maNV = sc.nextLine();
            for (int i = 0; i < nhanVien.size(); i++) {
                NhanVien nv = (NhanVien) nhanVien.get(i);
                if (nv.getMaNV().equals(maNV)) {
                    System.out.println("Nhập thông tin nhân viên cần cập nhật: ");
                    nv.nhapThongTin(sc);
                    System.out.println("Đã cập nhật nhân viên có mã " + maNV);
                    return;
                }
            }
            System.out.println("Không tìm thấy nhân viên có mã " + maNV);
        }

        //Hàm tìm các nhân viên theo khoảng lương từ bàn phím
        public void timKiemTheoLuong() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập khoảng lương: ");
            double luongMin = sc.nextDouble();
            double luongMax = sc.nextDouble();

            for (int i = 0; i < nhanVien.size(); i++) {
                NhanVien nv = (NhanVien) nhanVien.get(i);
                if (nv.getLuong() >= luongMin && nv.getLuong() <= luongMax) {
                    nv.hienThiThongTin();
                }
            }
        }

        //Hàm sắp xếp nhân viên theo họ và tên
        public void sapXepTheoHoTen() {
            Collections.sort(nhanVien, (a, b) -> a.getHoTen().compareTo(b.getHoTen()));
            nhanVien.forEach(nv -> nv.hienThiThongTin());
        }

        //Hàm sắp xếp nhân viên theo lương
        public void sapXepTheoLuong() {
            Collections.sort(nhanVien, (a, b) -> (int) (a.getThuNhap() - b.getThuNhap()));
            nhanVien.forEach(nv -> nv.hienThiThongTin());
        }

        //Hàm xuất 5 nhân viên có lương cao nhất
        public void xuat5NhanVienCoLuongCaoNhat() {
            sapXepTheoLuong();
            for (int i = nhanVien.size() - 1; i >= nhanVien.size() - 5; i--) {
                NhanVien nv = (NhanVien) nhanVien.get(i);
                nv.hienThiThongTin();
            }
        }
    }