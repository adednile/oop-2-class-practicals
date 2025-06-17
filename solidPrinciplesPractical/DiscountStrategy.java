package solidPrinciplesPractical;
//O - Open/Closed Principle
interface DiscountStrategy {
    double getDiscount();
}

class RegularDiscount implements DiscountStrategy {
    public double getDiscount() {
        return 0.1;
    }
}

class PremiumDiscount implements DiscountStrategy {
    public double getDiscount() {
        return 0.2;
    }
}

class DiscountCalculator {
    public double calculate(DiscountStrategy strategy) {
        return strategy.getDiscount();
    }
}
