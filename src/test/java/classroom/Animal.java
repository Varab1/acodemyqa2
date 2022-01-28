package classroom;

public class Animal {
    String type;
    String name;
    int age;
    int energy = 4;


    public Animal(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public void energy() {
        if (energy == 4) {
            System.out.println("My energy is" + " " + this.energy);
            System.out.println("Let's think of something");
            return;
        }
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }

    public void walk() {
        if (energy == 0) {
            System.out.println("I want eat");
            return;
        }
        System.out.println("I am walking");
        this.energy--;
        System.out.println("My energy is" + " " + this.energy);
    }

    public void play() {
        if (energy == 0) {
            System.out.println("I want eat");
            return;
        }
        System.out.println("I play");
        this.energy--;
        System.out.println("My energy is" + " " + this.energy);
    }

    public void workout() {
        if (energy == 0) {
            System.out.println("I want eat");
            return;
        }
        System.out.println("I practice");
        this.energy--;
        System.out.println("My energy is" + " " + this.energy);
    }

    public void feed() {
        if (energy < 4) {
            System.out.println("I am full");
            return;
        }


    }
}