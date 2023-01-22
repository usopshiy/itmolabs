package characters;

import enums.*;
import interfaces.*;
import objects.*;

import java.util.Objects;

public class Dog extends LivingEntity implements Holding {
    private final String name;
    private Holdable item;
    private Smell smell;
    private final Boolean ratCatcher;

    public Dog(String name, Boolean t) {
        this.name = name;
        this.ratCatcher = t;
        this.smell = Smell.NOSMELL;
    }

    public void goTo(Building b) {
        System.out.print(name);
        if (ratCatcher && b.getSmell() == Smell.RATTY) {
            this.setFeel(new Feeling("доволен"));
            System.out.print(" с огромнейшим удовольствием посешает " + b.getTitle() + ", пропитанную крысиным запахом\n");
        } else {
            System.out.print(" приходит в " + b.getTitle() + "\n");
        }
        this.setPosition(b);
        b.addInside(this);
    }

    public void catchRat(Rat rat) {
        System.out.println(name + " Ловит крысу");
        this.pickUp(rat);
        rat.setPosition(new Place("Во рту у собаки"));
        if (ratCatcher) {
            System.out.println(name + " Не грызет крысу, а лишь слегка придушивает");
        }

    }

    public void giveRat(Rat rat, Dog dog) {
        System.out.println(name + " Отдаёт крысу " + dog.toString());
        rat.giveTo(dog);
        this.drop(rat);
    }

    public void playWithRat(Rat rat) {
        this.setState(new State("Играет"));
        System.out.print(name + " С визгом носится");
        System.out.print(" с крысой в зубах\n");
        System.out.println(name + " На минуточку отпускает крысу и делает вид, будто смотрит в другую сторону");
        this.drop(rat);
        rat.setPosition(new Place("на полу"));
        rat.run();
        if (rat.getState().toString().equals("Убегает")) {
            this.catchRat(rat);
        }
        this.smell = Smell.RATTY;
    }

    public void entertainPeople(Building b) {
        System.out.println("Действия " + name + " забавляют обитателей " + b.getTitle());
        b.setPeopleFeel(new Feeling("Радость"));
        System.out.println("Обитатели " + b.getTitle() + " с нетерпением ожидают нового появления " + name);
        b.setPeopleState(new State("Ждёт"));
    }

    public void layNWait(Place place1, Rat rat) {
        this.position = place1;
        System.out.println(name + " Лежит " + place1.toString());
        this.state = new State("Ждёт");
        System.out.println(name + " выглядит, слушающей разговор");
        System.out.println(name + " на самом деле караулит " + rat.toString());
    }

    public Smell getSmell() {
        return smell;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return name.equals(dog.name);
    }

    public Holdable getItem() {
        return item;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public void pickUp(Holdable h) {
        this.item = h;
    }

    @Override
    public void drop(Holdable h) {
        this.item = null;
    }
}
