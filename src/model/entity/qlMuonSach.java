package model.entity;

import java.sql.Date;

public class qlMuonSach {
 public Integer sttMS;
 public String idKM;
 public String nameKM;
 public Integer phoneKM;
 public  String adressKM;
 public String idB;
 public String nameB;
 public Integer soluongM;
 public Date ngayM;

 public qlMuonSach(Integer sttMS, String idKM, String nameKM, Integer phoneKM, String adressKM, String idB, String nameB, Integer soluongM, Date ngayM) {
  this.sttMS = sttMS;
  this.idKM = idKM;
  this.nameKM = nameKM;
  this.phoneKM = phoneKM;
  this.adressKM = adressKM;
  this.idB = idB;
  this.nameB = nameB;
  this.soluongM = soluongM;
  this.ngayM = ngayM;
 }

    public Integer getSttMS() {
  return sttMS;
 }

 public void setSttMS(Integer sttMS) {
  this.sttMS = sttMS;
 }

 public String getIdKM() {
  return idKM;
 }

 public void setIdKM(String idKM) {
  this.idKM = idKM;
 }

 public String getNameKM() {
  return nameKM;
 }

 public void setNameKM(String nameKM) {
  this.nameKM = nameKM;
 }

 public Integer getPhoneKM() {
  return phoneKM;
 }

 public void setPhoneKM(Integer phoneKM) {
  this.phoneKM = phoneKM;
 }

 public String getAdressKM() {
  return adressKM;
 }

 public void setAdressKM(String adressKM) {
  this.adressKM = adressKM;
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

 public Integer getSoluongM() {
  return soluongM;
 }

 public void setSoluongM(Integer soluongM) {
  this.soluongM = soluongM;
 }

 public Date getNgayM() {
  return ngayM;
 }

 public void setNgayM(Date ngayM) {
  this.ngayM = ngayM;
 }
}
