package staff;

public class Cake extends Box {
    private double kKal;

    public Cake(String name, double weight, double price, double kKal) {
        super(name, weight, price);
        this.kKal = kKal;
    }

    public double getkKal() {
        return kKal;
    }

    public void setkKal(double kKal) {
        this.kKal = kKal;
    }

    @Override
    public String toString() {
        return "Cake{" + super.toString() + "kKal=" + kKal + '}';
    }
}




