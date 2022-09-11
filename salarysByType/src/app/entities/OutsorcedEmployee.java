package app.entities;

public class OutsorcedEmployee extends Employee {
    private Double charge;

    public OutsorcedEmployee(String name, Integer hours, Double valuePerHour, Double charge) {
        super(name, hours, valuePerHour);
        this.charge = charge;
    }
    public Double getCharge() {
        return charge;
    }
    public void setCharge(Double charge) {
        this.charge = charge;
    }
    @Override
    public double payment(Integer hours, Double valuePerHour) {
        return super.payment(hours, valuePerHour) + charge * 1.1;
    }
}
