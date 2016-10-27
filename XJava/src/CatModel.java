/**
 * Created by x_prt on 27.10.2016
 */
public class CatModel {

    private String name;
    private String breed; //порода
    private String color;
    private int age;
    private double weight; //вес

    public CatModel() {
        this.name = "no name";
        this.breed = "no breed";
        this.color = "no color";
        this.age = 0;
        this.weight = 0.0;
    }

    public CatModel(String name) {
        this.name = name;
    }

    public CatModel(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public CatModel(String name,
                    String breed,
                    String color,
                    int age,
                    double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ("Cat"
                + " name: " + name
                + "\n breed: " + breed
                + "\n color: " + color
                + "\n age: " + age
                + "\n weight: " + weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
