package characters;

import abilities.*;
import enums.DayTime;
import exceptions.PrintDescribeException;

public class Tiger extends Animal implements AbleToDoInstructions, Enjoyable, Speakable, AbleToBeNaughty, Disappearable {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void doActivity(String activity) {
        System.out.println(this.getName() + " " + activity);
    }

    @Override
    public void say(String info, boolean isLoudly) {
        System.out.println(this.getName() + " сказал " + info);
    }

    @Override
    public void beBadBoy() {
        System.out.println(this.getName() + " непослушный и неугомонный");
    }

    @Override
    public void disappear() {
        System.out.println("след простыл");
    }


    private class Tongue {
        public void stickOut() {
            System.out.println(Tiger.this.getName() + " высунул язык");
        }

        public void lick(Object obj){
            System.out.println("Язык " + Tiger.this.getName() + " пошел ходить вокруг " + obj);
        }


    }

    Tongue tongue = new Tongue();


    @Override
    public void showListToDo() {
        System.out.println("Тигра беззаботный - у него нет дел");
    }

    @Override
    public void eat(DayTime eatingTime) {
        tongue.stickOut();
        System.out.println("...Буль-буль (громкое)...");

    }

    @Override
    public void lick() {
        final Animal owner = this;
        class Muzzle {
            @Override
            public String toString() {
                return "мордочка" + " " + owner.getName();
            }
        }
        tongue.lick(new Muzzle());
        System.out.println("Если что-то осталось снаружи");
    }

    @Override
    public void smile() {
        System.out.println(this.getName() + " озарила умиротворенная улыбка");
    }

    public void approach() {
        System.out.println(this.getName() + " подошел поближе");
    }

    public void bentDown(Object obj) {
        if (!(obj instanceof AbleToBeOwned)){
            throw new PrintDescribeException("Нельзя наклоняться ни к чему, кроме кресла");
        }
        System.out.println(this.getName() + " наклонился над " + obj);
    }

}
