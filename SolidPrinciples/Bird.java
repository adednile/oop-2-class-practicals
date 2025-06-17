//L - Liskov Substitution Principle
interface Bird {
    void layEgg();
}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    public void fly() {
        System.out.println("Sparrow flying");
    }

    public void layEgg() { }
}

class Ostrich implements Bird {
    public void layEgg() { }
}
