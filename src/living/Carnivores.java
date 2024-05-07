package living;

public class Carnivores implements LivingOrganism {
    private String color;
    private int speed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void eat() {
        System.out.println("Eat Meats");
    }

    @Override
    public void move() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void breath() {

    }

    @Override
    public void sleep() {

    }
}
