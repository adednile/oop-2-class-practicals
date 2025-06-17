package hellloGreeterPractical;

import java.util.*;
public class HelloTillStop {
    Scanner sc = new Scanner(System.in);

    //Outputs hello while user wants to
    void showHello(){
        String choice; //Guard variable

        System.out.println("For hello type h,anything else to stop");
        choice = sc.nextLine(); //Set guard variable
        while("h".equals(choice)) {
            System.out.println("Hello");
            choice = sc.nextLine(); //Update guard variable
        }
    }

        public static void main(String[] args) {
            HelloTillStop test = new HelloTillStop();
            test.showHello();

        }
}
