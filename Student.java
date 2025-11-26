class Person
{
    String name;
    int age;
}
// Inheritance
class Student extends Person {
    int rollNo;

    void display() {
        System.out.println(name + " " + age + " " + rollNo);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Bhoomika";
        s.age = 20;
        s.rollNo = 55;
        s.display();
    }
}
