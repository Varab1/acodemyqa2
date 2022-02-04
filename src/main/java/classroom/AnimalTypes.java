package classroom;

public class AnimalTypes {
    public static void main(String[] args) {
        Animal one = new Animal("Cat", "Barsik", 5);
        Animal two = new Animal("Lion", "Bonifacij", 12);
        Animal three = new Animal("Elephant", "Eli", 30);
        Animal four = new Animal("Crocodile", "Gena", 56);
        Animal five = new Animal("Bear", "Winnie the Pooh", 8);
        Animal six = new Animal("Pig", "Piglet", 3);
        System.out.println(one.type);
        one.sleep();
        one.energy();
        one.walk();
        one.play();
        one.walk();
        one.play();
        one.workout();
        one.feed();


    }
}
