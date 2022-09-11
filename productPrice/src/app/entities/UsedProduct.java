package app.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    protected Date fabrication;
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct(String name, Double price, Date fabrication) {
        super(name, price);
        this.fabrication = fabrication;
    }

    public Date getFabrication() {
        return fabrication;
    }

    public void setFabrication(Date fabrication) {
        this.fabrication = fabrication;
    }

    @Override
    public String toString() {
        return name + " (used) $" + price + " (Fabrication date: " + date.format(fabrication) + ")";
    }
}
