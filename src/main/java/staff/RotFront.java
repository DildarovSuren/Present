package staff;

public class RotFront extends Box {
    private String sovietSadnessLevel;

    public RotFront(String name, double weight, double price, String sovietSadnessLevel) {
        super(name, weight, price);
        this.sovietSadnessLevel = sovietSadnessLevel;
    }

    public String getSovietSadnessLevel() {
        return sovietSadnessLevel;
    }

    public void setSovietSadnessLevel(String sovietSadnessLevel) {
        this.sovietSadnessLevel = sovietSadnessLevel;
    }

    @Override
    public String toString() {
        return "RotFront{" + super.toString() + "sovietSadnessLevel='" + sovietSadnessLevel + '\'' + '}';
    }
}
