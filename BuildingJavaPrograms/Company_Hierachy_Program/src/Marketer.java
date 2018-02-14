
public class Marketer extends Employee {
    public double getSalary() {
        return super.getSalary() + 10000;
    }
    public void advertise() {
        System.out.println("Act now, while supplies last!");
    }
}