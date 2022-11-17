package characters;

import abilities.*;
import enums.DayTime;
import enums.Priority;
import items.Issue;
import items.Letter;

public class Rabbit extends Animal implements AbleToBeResponsible, AbleToWrite, AbleToFeel, AbleToDoInstructions {
    private Issue issue;
    private Priority priority;


    public Rabbit(String name) {
        super(name);
    }

    public void wakeUp() {
        System.out.println(this.getName() + " проснулся");
    }

    @Override
    public void eat(DayTime eatingTime) {
        System.out.println("Кролик ест морковку");
    }

    @Override
    public void showListToDo() {
        System.out.println("Все зависит от " + this.getName());
        System.out.println("Все рассчитывают на " + this.getName());
        this.write();
        this.check();
        this.figureOut();
        this.explain();
        this.organise();
    }

    @Override
    public void figureOut() {
        issue.setDifficulty(false);
        if (priority.equals(Priority.FIGUREOUT)) System.out.println("и самое главное");
        System.out.println(this.getName() + " все выяснил");
    }

    @Override
    public boolean check() {
        if (priority.equals(Priority.CHECK)) System.out.println("и самое главное");
        System.out.println(this.getName() + " все проверил");
        return true;
    }

    @Override
    public void explain() {
        issue.setClearness(true);
        if (priority.equals(Priority.EXPLAIN)) System.out.println("и самое главное");
        System.out.println(this.getName() + " все объяснил");
    }

    @Override
    public void organise() {
        issue.setPreparedness(true);
        if (priority.equals(Priority.ORGANISE)) System.out.println("и самое главное");
        System.out.println(this.getName() + " все организовал");
    }

    @Override
    public Letter write() {
        return new Letter(this.getName());
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public void feel() {
        System.out.println(this.getName() + " почувствовал");
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }


    @Override
    public void doActivity(String activity) {
        System.out.println(this.getName() + " " + activity);
    }
}
