public class Try
{
public static void main(String[] attrs)
{
Cat ddd = new Cat();
System.out.println(ddd);
}

class Cat
{

String name;
String breed; //порода
String color;
int age;
double weight; //вес

public Cat()
{
this.name = "no name";
this.breed = "no breed";
this.color = "no color";
this.age = 0;
this.weight = 0.0;
}

public Cat(String name)
{
this.name = name;
}

public Cat(String name, String breed, String color)
{
this.name = name;
this.breed = breed;
this.color = color;
}

public Cat(String name,
String breed,
String color,
int age,
double weight)
{
this.name = name;
this.breed = breed;
this.color = color;
this.age = age;
this.weight = weight;
}

@Override
public String toString()
{
return (Cat.class.getName() 
+ " name: " + name 
+ "\n breed: " + breed
+ "\n color: " + color
+ "\n age: " + age
+ "\n weight: " + weight);
}
}
}
