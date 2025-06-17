package arrayChallengesPractical;
import java.util.Random;
public class OrderIdGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        String[] orderIDs = new String[10];
        for (int i = 0; i < orderIDs.length; i++) {
            char prefix = (char)(random.nextInt(5) + 'A'); //Adding 'A' (which is 65 in ASCII) gives values between 65 and 69, corresponding to characters 'A' to 'E'.
            int number = random.nextInt(999) + 1; // generate a number between 1 and 999
            String suffix = String.format("%03d",number); // format the number to be 3 digits with leading zeros
            orderIDs[i] = prefix + suffix; // concatenate prefix and suffix to form the order ID
        }
        for (String orderId : orderIDs) {
            System.out.println(orderId);
        }

    }
}
