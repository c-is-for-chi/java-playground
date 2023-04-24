public class Toy implements Action {
    private String brand;

    public Toy(String brand) {
        this.brand = brand;
    }

    public void play(Toy toy) {
        // System.out.println("TOY of brand " + brand + " is making some sound...");
        System.out.println("TOY of brand " + brand + " is making some kind of weird noise...");
    }
}
