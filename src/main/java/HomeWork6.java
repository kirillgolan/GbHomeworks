/**
 * Java 1. HomeWork #6
 *
 * @author KirillGolan
 * @version 28.02.22.
 */
class HomeWork6 {
    public static void main(String[] args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog(500,10);
        IAnimals[] animals = {cat, dog};
        for (IAnimals animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(199));
            System.out.println(animal.run(201));
            System.out.println(animal.run(501));
            System.out.println(animal.swim(10));
            System.out.println(animal.swim(15));
        }
    }
}

abstract class Animals implements IAnimals {
    protected String name;
    protected int maxRun;
    protected int maxSwim;

    Animals(int maxRun, int maxSwim) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        name = getClass().getName();
    }

    public String getName() {
        return name;
    }

    @Override
    public String run(int distance) {
        if (distance > maxRun) {
            return name + " not able to run " + distance + " m";
        }
        else {
            return name + " has ran " + distance + " m";
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > maxSwim) {
            return name + " not able to swim " + distance + " m";
        }
        else {
            return name + " has swimed " + distance + " m";
        }
    }

    @Override
    public String toString() {
        return name + " can run " + maxRun + " m" + ", and can swim " + maxSwim + " m";
    }
}

class Cat extends Animals {
    Cat(int maxRun) {
        super(maxRun, 0);
    }

    @Override
    public String swim(int distance) {
        return getName() + " can't swim";
    }
}

class Dog extends Animals {
    Dog(int maxRun, int maxSwim) {
        super(maxRun, maxSwim);
    }
}

interface IAnimals {
    String run(int distance);
    String swim(int distance);
}