package class_exercise_2;

public class ArrayChallenge {
    public static void main(String[] args) {
        String[] orderIds = {"A123", "B456", "C789", "D012", "E345"};

        for (String item : orderIds) {
            if (item.startsWith("A")){
                System.out.println(item);
            }
        }
    }
}
