package jelesson6;

interface Voice {
    default void voice() {
        System.out.print("\n" + ((Animal) this).id + " Hello, ");
        if (this instanceof Feral) {
            System.out.print("I am a wild animal " + this.getClass().getSimpleName());
            if (((Feral) this).isPredator) {
                System.out.print(" and I am angry");
            }
        } else if (this instanceof Pet) {
            System.out.print("my name is " + ((Pet) this).name + ".");
            if (this instanceof Cat) {
                System.out.print(" Meow!");
            } else if (this instanceof Dog) {
                System.out.print(" Woof!");
                if (this instanceof GuideDog) {
                    if (((GuideDog) this).isTrained) {
                        System.out.print(" I can take you home, come with me if you want to live.");
                    }
                }
            }
        }

    }
}

interface Swim {
    default void swim() {
        if (this instanceof Croco) {
            System.out.print(" *swings tail in the water*");
        } else if (this instanceof Fish) {
            System.out.print(" *wiggles fins in the water*");
        }
    }
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

abstract class Animal {
    static int counter;
    public int id;
    int age;
    int weight;
    String color;

    public Animal(int age, int weight, String color) {
        this.id = ++counter;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
}

abstract class Feral extends Animal {
    boolean isPredator;

    public Feral(int age, int weight, String color, boolean isPredator) {
        super(age, weight, color);
        this.isPredator = isPredator;
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
}

class Wolf extends Feral implements Voice {
    public Wolf(int age, int weight, String color, boolean isPredator) {
        super(age, weight, color, isPredator);
    }
}

class Lion extends Feral implements Voice {
    public Lion(int age, int weight, String color, boolean isPredator) {
        super(age, weight, color, isPredator);
    }
}

class Croco extends Feral implements Voice, Swim {
    public Croco(int age, int weight, String color, boolean isPredator) {
        super(age, weight, color, isPredator);
    }
}

class Giraffe extends Feral implements Voice {
    public Giraffe(int age, int weight, String color, boolean isPredator) {
        super(age, weight, color, isPredator);
    }
}

class Fish extends Pet implements Voice, Swim {
    public Fish(int age, int weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }

    @Override
    public void voice() {
        System.out.print("\n" + id + " " + getClass().getSimpleName() + " °°°bloop°°°");
    }
}

class Hamster extends Pet implements Voice {
    public Hamster(int age, int weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }
}

class Cat extends Pet implements Voice {
    public Cat(int age, int weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }
}

class Dog extends Pet implements Voice {
    public Dog(int age, int weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }
}

class GuideDog extends Dog implements Voice {
    boolean isTrained;

    public GuideDog(int age, int weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }
}