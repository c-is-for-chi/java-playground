public class Cat extends Animal {

    // setter funct
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // contructor
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        // v just means calls the constructor, whatever it is
        // super(name, age);
    }

    public void play(Toy toy) {
        System.out.println("CAT " + name + " jumps on the table.");
    }
}
