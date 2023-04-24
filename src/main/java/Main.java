public class Main {
    public static void main(String[] args) {
        Cat coco = new Cat("Coco", 14);
        // coco.setName("Coco II");
        // coco.play();
        // System.out.println("There's a cat called " + coco.getName() + " on the table! \n");

        Dog max = new Dog ("Max", 5, "Peng");
        // max.play();

        Rabbit snowWhite = new Rabbit("Snowball", "red");

        Toy curiousGeorge = new Toy("ABC corp");

        // curiousGeorge.play();

        /*
        Animal[] animals = new Animal[4];
        animals[0] = coco;
        animals[1] = max;
        animals[2] = snowWhite;
        animals[3] = curiousGeorge;

        for (Animal animal : animals) {
            animal.play();
        }
        */

        Toy toy = new Toy("Boytoy");

        //Action[] homeFriend = new Action[4];
        //homeFriend[0] = coco;
        //homeFriend[1] = max;
        //homeFriend[2] = snowWhite;
        //homeFriend[3] = curiousGeorge;

        Action[] homeFriend = new Action[1];
        homeFriend[0] = toy;

        for (Action friend : homeFriend) {
            friend.play(toy);
        }
    }
}
