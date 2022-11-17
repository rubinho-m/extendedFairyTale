package characters;

import abilities.Speakable;
import enums.DayTime;

public abstract class Animal {
    private final String name;
    private static int animalNumber = 0;
    private int id;

    public Animal(String name) {
        this.name = name;
        System.out.println(this.name + " создан");
        animalNumber++;
        id = animalNumber;
    }

    private String foodToEat;

    public String getFoodToEat() {
        return foodToEat;
    }

    public void setFoodToEat(String foodToEat) {
        this.foodToEat = foodToEat;
    }


    public abstract void eat(DayTime eatingTime);


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Animal compareAnimal = (Animal) obj;
        return this.hashCode() == compareAnimal.hashCode();
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Имя этого животного: " + this.getName();
    }

    public String getName() {
        return name;
    }


    public abstract void showListToDo();
}
