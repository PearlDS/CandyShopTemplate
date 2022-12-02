import java.util.Objects;

public class Chocolate implements Comparable<Chocolate>{

    private String name;
    private double price;
    private String colour;
    private int calories;

    public Chocolate() {
    }

    public Chocolate(String name, double price, String colour, int calories) {
        this.name = name;
        this.price = price;
        this.colour = colour;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chocolate)) return false;
        Chocolate chocolate = (Chocolate) o;
        return getCalories() == chocolate.getCalories() && Objects.equals(getName(), chocolate.getName()) && Objects.equals(getColour(), chocolate.getColour());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getColour(), getCalories());
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                ", calories=" + calories +
                '}';
    }

    @Override
    public int compareTo(Chocolate o) {
        return this.colour.compareTo(o.colour);
    }

//    @Override
//    public int compareTo(Chocolate o) {
//        return this.calories - o.calories;
//    }


}
