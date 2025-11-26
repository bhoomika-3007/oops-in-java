public class Animal 
{
    void eat() 
    { 
        System.out.println("Animal eats");
    }
}

// Multilevel Inheritance

class Mammal extends Animal 
{
    void walk() 
    { 
        System.out.println("Mammal walks"); 
    }
}

class Dog extends Mammal 
{
    void bark() 
    { 
        System.out.println("Dog barks"); 
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.walk();
        d.bark();
    }
}
