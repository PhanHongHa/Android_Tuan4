package com.example.android_tuan4;

public class Product2 {
    private String ten;
    private String giaBan;
    private String giamGia;
    private int hinhAnh;

    public Product2(String ten, String giaBan, String giamGia, int hinhAnh) {
        this.ten = ten;
        this.giaBan = giaBan;
        this.giamGia = giamGia;
        this.hinhAnh = hinhAnh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public String getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(String giamGia) {
        this.giamGia = giamGia;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
