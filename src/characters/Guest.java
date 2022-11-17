package characters;

import abilities.Eatable;
import abilities.Livable;
import enums.DayTime;
import items.Home;

import java.util.Objects;

public class Guest extends Person implements Livable, Eatable {
    private Home home;
    private String food;

    public Guest(String pronoun) {
        super(pronoun);
        System.out.println("Главный персонаж создан");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }


    public Home getHome() {
        return home;
    }


    public void settle(Home home) {
        System.out.println(this.pronoun + " поселился в " + home);
    }


    @Override
    public void showInfo() {
        System.out.println("Персонаж. Дом персонажа - " + home);
    }


    @Override
    public void eat(DayTime time) {
        System.out.println(this.pronoun + " получает " + this.getFood() + " на " + time.getTranslation());
    }


}
