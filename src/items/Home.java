package items;

import characters.Animal;

public class Home {
    private final String owner;

    private Animal guest;

    public Animal getGuest() {
        return guest;
    }

    public void setGuest(Animal guest) {
        this.guest = guest;

    }

    private boolean farDistance;

    public Home(String owner) {
        this.owner = owner;
        System.out.println("Дом, который принадлежит " + this.owner + ", создан");
    }

    public boolean isFarDistance() {
        return farDistance;
    }

    public void setFarDistance(boolean farDistance) {
        this.farDistance = farDistance;
    }

    public void showDistance() {
        if (isFarDistance()) {
            System.out.println("дом, который принадлежит " + this.owner + " далеко");
        } else {
            System.out.println("дом, который принадлежит " + this.owner + " близко");
        }
    }

    public void showGuest(String description) {
        System.out.println("В доме, который принадлежит " + this.owner + " " + description + " находится " + this.guest.getName());
    }

    @Override
    public String toString() {
        return "дом, который принадлежит " + this.owner;
    }
}
