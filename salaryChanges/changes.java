public class changes {
    double salary;
    String name;
    double tax;
    double percentage;

    public double increseSalary() {
        salary = salary - tax;
        salary = salary * (percentage * 0.01);
        return salary;
    }
    public String toString() {
        return name
        + ", R$" + salary;
    }
}
