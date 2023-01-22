
import characters.*;
import objects.Building;
import enums.*;
import objects.Place;
import objects.*;

public class Main {
    public static void main(String[] args)  {
            Place floornearlegs = new Place("на полу около ног");
            Place undershelf = new Place("под полкой");
            Place buro = new Place("Сыскная контора");
            Feeling happy = new Feeling("Радость");
            Feeling neutral = new Feeling("никакое");
            Person neznayka = new Person("Незнайка");
            Person kozlik = new Person("Козлик");
            Person minoga = new Person("Госпожа Минога");
            Detective det = new Detective("Господин Биггль", buro);
            Boss ow = new Boss("Владелец конторы", buro);
            Dog roland = new Dog("Роланд", true);
            Dog mimi = new Dog("Мимишка", false);
            Rat rat = new Rat();
            Building inn = new Building("Дрянинингская ночлежка");
            inn.setSmell(Smell.RATTY);

            neznayka.setFeel(happy);
            kozlik.setFeel(happy);
            neznayka.goTo(inn);
            kozlik.goTo(inn);
            mimi.goTo(inn);
            roland.goTo(inn);
            rat.hide(undershelf);
            roland.layNWait(floornearlegs, rat);
            mimi.layNWait(floornearlegs, rat);
            roland.catchRat(rat);
            roland.giveRat(rat, mimi);
            mimi.playWithRat(rat);
            mimi.entertainPeople(inn);
            neznayka.setFeel(neutral);
            kozlik.setFeel(neutral);
            minoga.smellDog(mimi);
            minoga.callBuro(neznayka);
            ow.giveTask(det, neznayka);
            ow.tellResults(minoga);
    }
}
