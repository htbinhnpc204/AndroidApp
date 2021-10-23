package com.htbinh.studentapp.Model;

public class ThongbaoModel {
    private String Ten;
    private String  MoTa;

    public ThongbaoModel(String ten, String moTa) {
        Ten = ten;
        MoTa = moTa;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }
}
