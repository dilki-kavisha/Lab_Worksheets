package LW_06;

public class Dog extends Pet{
    double weight;

    public Dog(String name) {
        super();
        super.setName(name);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String speak() {
        return "";
    }
}