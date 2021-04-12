package model.entity;

public class qlTraSach extends qlSach{
    public String dateRe;
    public Double priceRe;
    public Double stillOwe;

    public qlTraSach(String idB, String nameB, String author, String category, String dateRe, Double priceRe, Double stillOwe) {
        super(idB, nameB, author, category);
        this.dateRe = dateRe;
        this.priceRe = priceRe;
        this.stillOwe = stillOwe;
    }

    public String getDateRe() {
        return dateRe;
    }

    public void setDateRe(String dateRe) {
        this.dateRe = dateRe;
    }

    public Double getPriceRe() {
        return priceRe;
    }

    public void setPriceRe(Double priceRe) {
        this.priceRe = priceRe;
    }

    public Double getStillOwe() {
        return stillOwe;
    }

    public void setStillOwe(Double stillOwe) {
        this.stillOwe = stillOwe;
    }

    public qlTraSach(String idB, String nameB, String author, String category) {
        super(idB, nameB, author, category);
    }
}
