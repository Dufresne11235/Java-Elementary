package jelesson5;

public class Homework5 {
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
        longhNeckssMonster.voice();
        nemo.voice();
        chip.voice();
        cheshire.voice();
        diefenbaker.voice();
        rex.voice();
    }
}

abstract class Animal {
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
        System.out.println();
        System.out.print(id + " Hello, ");
    }
}

abstract class Feral extends Animal {
    boolean isPredator;

    public Feral(int age, int weight, String color, boolean isPredator) {
        super(age, weight, color);
        this.isPredator = isPredator;
    }

    public void voice() {
        super.voice();
        System.out.print("I am a wild animal");
        if (isPredator) {
            System.out.print(" and I am angry ");
        }
    }
}

abstract class Pet extends Animal {
    String name;
    boolean isVaccinated;

    public Pet(int age, int weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    public void voice() {
        super.voice();
        System.out.print("my name is " + name + ".");
    }
}

class Wolf extends Feral {
    public Wolf(int age, int weight, String color, boolean isPredator) {
        super(age, weight, color, isPredator);
    }
}

class Lion extends Feral {
    public Lion(int age, int weight, String color, boolean isPredator) {
        super(age, weight, color, isPredator);
    }
}

class Croco extends Feral {
    public Croco(int age, int weight, String color, boolean isPredator) {
        super(age, weight, color, isPredator);
    }
}

class Giraffe extends Feral {
    public Giraffe(int age, int weight, String color, boolean isPredator) {
        super(age, weight, color, isPredator);
    }
}

class Fish extends Pet {
    public Fish(int age, int weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }

    public void voice() {
        System.out.print("\n°°°bloop°°°");
    }
}

class Hamster extends Pet {
    public Hamster(int age, int weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }
}

class Cat extends Pet {
    public Cat(int age, int weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }

    public void voice() {
        super.voice();
        System.out.print(" Meaou!");
    }
}

class Dog extends Pet {
    public Dog(int age, int weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }

    public void voice() {
        super.voice();
        System.out.print(" Wooff!");
    }
}

class GuideDog extends Dog {
    boolean isTrained;

    public GuideDog(int age, int weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    public void voice() {
        super.voice();
        if (isTrained){
            System.out.print(" I can take you home, come with me if you want to live");
        }
    }
}
