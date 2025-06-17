package hellloGreeterPractical;

import java.util.Scanner;
public class InputExample {
    Scanner sc = new Scanner(System.in);
    public void read_name_and_age()
    {
        String name;
        int age; //In years.
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        System.out.println("Hello, " + name + ", you are " + age + " winters old");
    }
    public static void main(String[] args) {
        (new InputExample()).read_name_and_age();
    }
}
