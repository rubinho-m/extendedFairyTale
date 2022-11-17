import abilities.AbleToBeOwned;
import abilities.Disappearable;
import characters.*;
import enums.DayTime;
import enums.Priority;
import exceptions.NameException;
import exceptions.PrintDescribeException;
import items.Day;
import items.Home;
import items.Issue;

public class Main {
    public static void main(String[] args) throws NameException {
        Guest mainCharacter = new Guest("Он");
        Spectator we = new Spectator("Мы");
        Tiger tigra = new Tiger("Тигра");
        tigra.approach();
        AbleToBeOwned chair = new AbleToBeOwned() {
            private Animal owner;

            @Override
            public void setOwner(Animal owner) {

                this.owner = owner;
            }

            @Override
            public String toString() {
                return "стул " + this.owner.getName();
            }
        };
        Kangaroo ru = new Kangaroo("Ру");
        Kangaroo kenga = new Kangaroo("Кенга");
        kenga.setChild(ru);
        chair.setOwner(ru);
        try {
            tigra.bentDown(chair);
        } catch (PrintDescribeException e) {
            System.out.println("Тигра решил не наклоняться");
        }
        tigra.eat(DayTime.BREAKFAST);
        kenga.say("Ой!", true);
        Kangaroo.Spoon spoon = new Kangaroo.Spoon();
        spoon.beTaken(kenga);
        spoon.beSwallowed(tigra);
        kenga.save(spoon);
        Disappearable fishOil = () -> System.out.println("Рыбий жир исчез");
        fishOil.disappear();
        tigra.doActivity("посмотрел на потолок");
        tigra.doActivity("закрыл глаза");
        tigra.lick();
        tigra.smile();
        tigra.say("", false);
        String porridge = "ложка-другая кашки";
        kenga.setGuest(mainCharacter);
        ru.setGuest(mainCharacter);
        we.setEmotion("не удивляемся");
        we.showEmotion();
        Home kengaHome = new Home(kenga.getName());
        kenga.settle(kengaHome);
        ru.settle(kengaHome);
        mainCharacter.settle(kengaHome);
        mainCharacter.setFood("рыбий жир");
        mainCharacter.eat(DayTime.BREAKFAST);
        mainCharacter.eat(DayTime.LUNCH);
        mainCharacter.eat(DayTime.DINNER);
        mainCharacter.setHungry(true);
        if (kenga.isConcerned(mainCharacter)) {
            mainCharacter.setFood(porridge);
            kenga.concern(mainCharacter);
        }
        if (kenga.isConcerned(ru)) {
            ru.setFoodToEat(porridge);
            ru.eat(DayTime.BREAKFAST);
        }

        Rabbit rabbit = new Rabbit("Кролик");
        Day day = new Day("занятой", rabbit);
        rabbit.setPriority(Priority.ORGANISE);
        rabbit.setIssue(new Issue(true, false, false));
        rabbit.wakeUp();
        rabbit.feel();
        day.showPlans();
        Day.Morning morning = new Day.Morning();
        Animal puh = new Animal("Пух") {
            @Override
            public void eat(DayTime eatingTime) {
                System.out.println("Пух не хочет есть");
            }

            @Override
            public void showListToDo() {
                System.out.println(this.getName() + " считает...");
            }


        };
        Animal pyatachok = new Animal("Пятачок") {
            @Override
            public void eat(DayTime eatingTime) {
                System.out.println("Пятачок не хочет есть");
            }

            @Override
            public void showListToDo() {
                System.out.println("У Пятачка нет дел");
            }


        };
        Animal owl = new Animal("Сова") {
            @Override
            public void eat(DayTime eatingTime) {
                System.out.println("Сова не ест днем");
            }

            @Override
            public void showListToDo() {
                System.out.println("Сова ухает");
            }

        };

        if (!puh.getName().equals("Пух") | !pyatachok.getName().equals("Пятачок") | !owl.getName().equals("Сова")){
            throw new NameException();
        }

        morning.needToDo("забежать на минутку к " + puh.getName());
        morning.needToDo("cказать: Ну что ж, отлично, тогда я передам " + pyatachok.getName());
        morning.needToDo(String.format("сообщить %s:", pyatachok.getName()));
        puh.showListToDo();
        morning.needToDo("сначала заглянуть к " + owl.getName());
        day.setTypeOfDay("командирский");
        day.showInfo();
        Spectator all = new Spectator("Все");
        all.say("Да, " + rabbit.getName(), false);
        all.say("Хорошо, " + rabbit.getName(), false);
        all.say("Будет исполнено, " + rabbit.getName(), false);
        all.wait("дальнейшие распоряжения");
        rabbit.doActivity("вышел из дома");
        rabbit.doActivity("принюхался к теплому весеннему ветру");
        rabbit.doActivity("размышлял с чего начать");
        kengaHome.setFarDistance(false);
        kengaHome.showDistance();
        kengaHome.setGuest(ru);
        kengaHome.showGuest("просто");

        ru.doActivity("говорить");
        ru.say("Да, " + rabbit.getName(), false);
        ru.say("Хорошо, " + rabbit.getName(), false);
        ru.doActivity("лучше всех в лесу");

        kengaHome.setGuest(tigra);
        kengaHome.showGuest("безотлучно");
        tigra.beBadBoy();
        tigra.doActivity("лучше все знает");
        all.say("куда надо идти", false);
        tigra.doActivity("прибегает туда первым");
        all.doActivity("добираетесь");
        tigra.disappear();
        all.doActivity("некому гордо сказать");
        all.say("Ну вот, мы у цели!", false);


    }
}


