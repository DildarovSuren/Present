package staff;

public class SugarStick extends Box {
    private String packSize;

    public SugarStick(String name, double weight, double price, String packSize) {
        super(name, weight, price);
        this.packSize = packSize;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    @Override
    public String toString() {
        return "SugarStick{" + super.toString() + "packSize='" + packSize + '\'' + '}';
    }
}
