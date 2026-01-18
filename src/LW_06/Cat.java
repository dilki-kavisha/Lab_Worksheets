package LW_06;

public class Cat extends Pet{
    String coatColor;

    public Cat(String name) {
        super();
        super.setName(name);
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    @Override
    public String speak() {
        return "";
    }
}