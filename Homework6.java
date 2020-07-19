package jelesson6;

interface Voice {
    void voice();
}

interface Swim {
    void swim();
}

public class Homework6 {
    public static void main(String[] args) {
        Wolf mrGrey = new Wolf(5, 20, "grey", true);
        Lion simba = new Lion(5, 50, "yellow", true);
        Croco lacoste = new Croco(5, 50, "green", true);
        Giraffe longhNeckssMonster = new Giraffe(5, 150, "spotted", false);
        Fish nemo = new Fish(5, 1, "scale", "Nemo", false);
        Hamster chip = new Hamster(5, 1, "brown", "Chip", false);
        Cat cheshire = new Cat(5, 5, "paddy", "Cheshire", true);
        Dog diefenbaker = new Dog(5, 20, "white", "Diefenbaker", true);
        GuideDog rex = new GuideDog(5, 20, "black", "Rex", true, true);

        mrGrey.voice();
        simba.voice();
        lacoste.voice();
        lacoste.swim();
        longhNeckssMonster.voice();
        nemo.voice();
        nemo.swim();
        chip.voice();
        cheshire.voice();
        diefenbaker.voice();
        rex.voice();
    }
}

abstract class Animal implements Voice {
    static int counter;
    int id;
    int age;
    int weight;
    String color;

    public Animal(int age, int weight, String color) {
        this.id = ++counter;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void voice() {
        System.out.print("\n" + id + " Hello, ");
    }
}

abstract class Feral extends Animal implements Voice {
    boolean predator;

    public Feral(int age, int weight, String color, boolean predator) {
        super(age, weight, color);
        this.predator = predator;
    }

    public void voice() {
        super.voice();
        System.out.print("I am a wild animal " + this.getClass().getSimpleName());
        if (predator) {
            System.out.print(" and I am angry ");
        }
    }
}

abstract class Pet extends Animal implements Voice {
    String name;
    boolean vaccinated;

    public Pet(int age, int weight, String color, String name, boolean vaccinated) {
        super(age, weight, color);
        this.name = name;
        this.vaccinated = vaccinated;
    }

    public void voice() {
        super.voice();
        System.out.print("my name is " + name + ".");
    }
}

class Wolf extends Feral implements Voice {
    public Wolf(int age, int weight, String color, boolean predator) {
        super(age, weight, color, predator);
    }
}

class Lion extends Feral implements Voice {
    public Lion(int age, int weight, String color, boolean predator) {
        super(age, weight, color, predator);
    }
}

class Croco extends Feral implements Voice, Swim {
    public Croco(int age, int weight, String color, boolean predator) {
        super(age, weight, color, predator);
    }

    @Override
    public void swim() {
        System.out.print("\n*swings tail in the water*");
    }
}

class Giraffe extends Feral implements Voice {
    public Giraffe(int age, int weight, String color, boolean predator) {
        super(age, weight, color, predator);
    }
}

class Fish extends Pet implements Voice, Swim {
    public Fish(int age, int weight, String color, String name, boolean vaccinated) {
        super(age, weight, color, name, vaccinated);
    }

    public void voice() {
        System.out.print("\n°°°bloop°°°");
    }

    @Override
    public void swim() {
        System.out.print("\n*wiggles fins in the water*");
    }
}

class Hamster extends Pet implements Voice {
    public Hamster(int age, int weight, String color, String name, boolean vaccinated) {
        super(age, weight, color, name, vaccinated);
    }
}

class Cat extends Pet implements Voice {
    public Cat(int age, int weight, String color, String name, boolean vaccinated) {
        super(age, weight, color, name, vaccinated);
    }

    public void voice() {
        super.voice();
        System.out.print(" Meow!");
    }
}

class Dog extends Pet implements Voice {
    public Dog(int age, int weight, String color, String name, boolean vaccinated) {
        super(age, weight, color, name, vaccinated);
    }

    public void voice() {
        super.voice();
        System.out.print(" Woof!");
    }
}

class GuideDog extends Dog implements Voice {
    boolean trained;

    public GuideDog(int age, int weight, String color, String name, boolean vaccinated, boolean trained) {
        super(age, weight, color, name, vaccinated);
        this.trained = trained;
    }

    public void voice() {
        super.voice();
        if (trained) {
            System.out.print(" I can take you home, come with me if you want to live");
        }
    }
}
