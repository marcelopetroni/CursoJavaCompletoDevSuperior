public class account {
    private int number;
    private String name;
    private double value;

    public account(int number, String name, double value) {
        this.number = number;
        this.name = name;
        this.value = value;
        // it doesn´t need to declare value because starts with 0 unless someone puts money in the account
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getValue() {
        return value;
    }
    public void deposit(double deposit) {
        this.value = value + deposit;
    }
    public void withdraw(double withdraw) {
        this.value = value - (withdraw + 5);
    }

    public String toString() {
        return 
        "Account: " + number  + ", Holder: " + name + ", Balance: " + value;
    }

}
