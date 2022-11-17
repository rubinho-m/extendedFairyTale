package items;

import characters.Animal;

public class Day {
    public static class Morning {
        public void needToDo(String activity) {
            System.out.println("необходимо " + activity);
        }
    }

    private String typeOfDay;
    private final Animal mainCharacter;

    public Day(String typeOfDay, Animal mainCharacter) {
        this.typeOfDay = typeOfDay;
        this.mainCharacter = mainCharacter;
        System.out.println(typeOfDay + " день начался");
    }

    public void showPlans() {
        System.out.println(typeOfDay + " день:");
        mainCharacter.showListToDo();
    }

    public String getTypeOfDay() {
        return typeOfDay;
    }

    public void setTypeOfDay(String typeOfDay) {
        this.typeOfDay = typeOfDay;
    }
    public void showInfo(){
        System.out.println("День: " + typeOfDay);
    }
}
