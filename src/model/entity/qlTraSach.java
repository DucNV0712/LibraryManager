package model.entity;


import java.sql.Date;

public class qlTraSach {
    public Integer sttTS;
    public String idKT;
    public String nameKT;
    public Integer phoneKT;
    public  String adressKT;
    public String idB;
    public String nameB;
    public Integer soluongT;
    public Date ngayT;

    public qlTraSach(Integer sttTS, String idKT, String nameKT, Integer phoneKT, String adressKT, String idB, String nameB, Integer soluongT, Date ngayT) {
        this.sttTS = sttTS;
        this.idKT = idKT;
        this.nameKT = nameKT;
        this.phoneKT = phoneKT;
        this.adressKT = adressKT;
        this.idB = idB;
        this.nameB = nameB;
        this.soluongT = soluongT;
        this.ngayT = ngayT;
    }

    public Integer getSttTS() {
        return sttTS;
    }

    public void setSttTS(Integer sttTS) {
        this.sttTS = sttTS;
    }

    public String getIdKT() {
        return idKT;
    }

    public void setIdKT(String idKT) {
        this.idKT = idKT;
    }

    public String getNameKT() {
        return nameKT;
    }

    public void setNameKT(String nameKT) {
        this.nameKT = nameKT;
    }

    public Integer getPhoneKT() {
        return phoneKT;
    }

    public void setPhoneKT(Integer phoneKT) {
        this.phoneKT = phoneKT;
    }

    public String getAdressKT() {
        return adressKT;
    }

    public void setAdressKT(String adressKT) {
        this.adressKT = adressKT;
    }

    public String getIdB() {
        return idB;
    }

    public void setIdB(String idB) {
        this.idB = idB;
    }

    public String getNameB() {
        return nameB;
    }

    public void setNameB(String nameB) {
        this.nameB = nameB;
    }

    public Integer getSoluongT() {
        return soluongT;
    }

    public void setSoluongT(Integer soluongT) {
        this.soluongT = soluongT;
    }

    public Date getNgayT() {
        return ngayT;
    }

    public void setNgayT(Date ngayT) {
        this.ngayT = ngayT;
    }
}
