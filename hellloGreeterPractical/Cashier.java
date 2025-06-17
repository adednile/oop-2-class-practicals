package hellloGreeterPractical;

public class Cashier {
    private double expenditure;
    private double discount;
    private double amount_payable;

    public void set_expenditure(double expenditure) {
        this.expenditure = expenditure;
    }
    public void customer_discount() {
        if (expenditure >= 100000) {
            System.out.println("Your total expense is $" + expenditure);
            System.out.println("You get a 10% discount");
            discount = (10 * expenditure)/100;
            amount_payable = expenditure - discount;
            System.out.println("After 10% discount: " + amount_payable);
        }
        else if (expenditure >= 75000) {
            System.out.println("Your total expense is $ " + expenditure );
            System.out.println("You get a 7% discount");
            discount = (7 * expenditure)/100;
            amount_payable = expenditure - discount;
            System.out.println("After 7% discount: " + amount_payable);
        }
        else if (expenditure >= 50000) {
            System.out.println("Your total expense is $" + expenditure);
            System.out.println("You get a 5% discount");
            discount = (5 * expenditure)/100;
            amount_payable = expenditure - discount;
            System.out.println("After 5% discount: " + amount_payable);
        }
        else if (expenditure < 50000) {
            System.out.println("Your total expense is $" + expenditure);
            System.out.println("You get a 5% discount");
            discount = (5 * expenditure)/100;
            amount_payable = expenditure - discount;
            System.out.println("After 5% discount: " + amount_payable);
        }
        else {
            System.out.println("Invalid expenditure entered");
        }
    }
    public static void main(String[] args) {
        Cashier e1 = new Cashier();
        e1.set_expenditure(56000);
        e1.customer_discount();
    }
}
