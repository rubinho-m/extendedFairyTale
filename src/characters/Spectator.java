package characters;

import abilities.AbleToDoInstructions;
import abilities.Speakable;
import abilities.Waitable;

public class Spectator extends Person implements Speakable, Waitable, AbleToDoInstructions {

    public Spectator(String pronoun) {
        super(pronoun);
        System.out.println(pronoun + " создан");
    }

    @Override
    public void showInfo() {
        System.out.println("Наблюдатель.");
    }

    @Override
    public void say(String info, boolean isLoudly) {
        System.out.println(this.pronoun + " говорит " + info);
    }

    @Override
    public void wait(String info){
        System.out.println(this.pronoun + " ожидает " + info);
    }

    @Override
    public void doActivity(String activity) {
        System.out.println(this.pronoun + " " + activity);
    }
}
