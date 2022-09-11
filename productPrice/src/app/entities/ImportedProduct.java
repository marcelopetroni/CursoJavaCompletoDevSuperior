package app.entities;

public class ImportedProduct extends Product {
    protected Double fee;

    public ImportedProduct(String name, Double price, Double fee) {
        super(name, price);
        this.fee = fee;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return super.toString() + " (Costums fee: $" + fee + ")";
    }

    @Override
    public Double totalPrice(Double price) {
        return super.totalPrice(price) + fee;
    }

}
