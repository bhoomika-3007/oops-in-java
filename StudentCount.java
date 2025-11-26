// Counting students using Static keyword

public class StudentCount {
    static int count = 0;

    StudentCount() {
        count++;
    }

    public static void main(String[] args) {
        new StudentCount();
        new StudentCount();
        new StudentCount();

        System.out.println("Total Students: " + StudentCount.count);
    }
}

