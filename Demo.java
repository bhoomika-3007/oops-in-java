public class Demo{
    String name;
    String breed;
    int age;
    String color;
    public Demo(String name, String breed, int age, String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    public String getName()
    {
        return name;
    }
    public String getBreed()
    {
        return breed;
    }
    public int getAge()
    {
        return age;
    }
    public String getColor()
    {
        return color;
    }
    public String toString()
    {
        return "Name is: " + name + "\nBreed age and color are: " + breed + " " + age + " " + color;
    }
    public static void main(String[] args)
    {
        Demo tommy = new Demo("tommy","German Shepherd", 5, "Brown");
        System.out.println(tommy);    
    }
}
