package characters;

import java.util.Objects;

public abstract class Person {
    private String emotion;
    protected String pronoun;
    private boolean isHungry;

    public Person(String pronoun) {
        this.pronoun = pronoun;
    }


    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public String getPronoun() {
        return pronoun;
    }


    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public abstract void showInfo();

    public void showEmotion() {
        System.out.println(this.pronoun + " " + this.getEmotion());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return isHungry == person.isHungry && Objects.equals(emotion, person.emotion) && Objects.equals(pronoun, person.pronoun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emotion, pronoun, isHungry);
    }

    @Override
    public String toString() {
        return "К этому существу обращаются как " + this.getPronoun();
    }
}
