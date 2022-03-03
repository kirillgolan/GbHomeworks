/**
 * Java 1. HomeWork #7
 *
 * @author KirillGolan
 * @version 03.03.22.
 */
class HomeWork7 {
    public static void main(String[] args) {
        Cat1[] cats = {new Cat1("Oleg", 10), new Cat1("Victor", 25), new Cat1("Zaurbek", 15)};
        Plate plate = new Plate(40);
        System.out.println(plate);
        for (Cat1 cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.add(45);
        System.out.println(plate);

        for (Cat1 cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);

    }
}

class Cat1 {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat1(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    void setFullness(boolean status) {
        fullness = status;
    }

    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "Cat: " + name + ", appetite: " + appetite + ", fullness: " + fullness;
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        this.food += food;
    }

    @Override
    public String toString() {
        return "Plate, " + food;
    }

}