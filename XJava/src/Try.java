/**
 * Created by x_prt_000 on 25.10.2016
 */
public class Try {
    public static void main(String[] args) {
        Cat ddd = new Cat();
        System.out.println(ddd);
    }

    private static class Cat {

        String name;
        String breed; //порода
        String color;
        int age;
        double weight; //вес

        Cat() {
            this.name = "no name";
            this.breed = "no breed";
            this.color = "no color";
            this.age = 0;
            this.weight = 0.0;
        }

        public Cat(String name) {
            this.name = name;
        }

        public Cat(String name, String breed, String color) {
            this.name = name;
            this.breed = breed;
            this.color = color;
        }

        public Cat(String name,
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
    }
}

