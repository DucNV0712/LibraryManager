package model.entity;

import java.sql.Date;

public class qlSach {
    public Integer sttb;
    public String idB;
    public String nameB;
    public String author;
    public String category;
    public Integer amountB;

    public qlSach(Integer sttb, String idB, String nameB, String author, String category, Integer amountB) {
        this.sttb = sttb;
        this.idB = idB;
        this.nameB = nameB;
        this.author = author;
        this.category = category;
        this.amountB = amountB;
    }

    public Integer getSttb() {
        return sttb;
    }

    public void setSttb(Integer sttb) {
        this.sttb = sttb;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getAmountB() {
        return amountB;
    }

    public void setAmountB(Integer amountB) {
        this.amountB = amountB;
    }
}

