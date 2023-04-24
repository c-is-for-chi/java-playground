public class Dog extends Animal{
    private String owner;

    public Dog (String name, int age, String owner) {
        // super(name, age);
        // ^ if you add that, you can delete the next two lines
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public void setName() {
        this.name = name;
    }

    public void play(Toy toy) {
        System.out.println("DOG " + name + " is chasing it's tail!");
    }
}
