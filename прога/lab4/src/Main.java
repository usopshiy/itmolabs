import exceptions.Exceptions;
import characters.*;
import objects.Building;
import enums.*;
import objects.Place;
import objects.*;

import java.util.ArrayList;
import java.util.function.*;

public class Main {
    public static void main(String[] args) throws Exceptions.StoryException {
        try {
            Place floornearlegs = new Place("на полу около ног");
            Place undershelf = new Place("под полкой");
            Place buro = new Place("Сыскная контора");
            Feeling happy = new Feeling("Радость");
            Feeling neutral = new Feeling("никакое");
            Doctor doc = new Doctor("Врач");
            Person neznayka = new Person("Незнайка");
            Person kozlik = new Person("Козлик");
            Person minoga = new Person("Госпожа Минога");
            Person maid = new Person("Горничная");
            ArrayList<String> drugs = new ArrayList<String>(){
                {
                    add("витамины разных сортов");
                    add("антибиотики");
                    add("ситомициновая эмульсия для прикладывания к распухшей шее");
                    add("стрептоцид");
                    add("пирамидон");
                    add("новокаин");
                }
            };
            Detective det = new Detective("Господин Биггль", buro);
            Boss ow = new Boss("Владелец конторы", buro);
            Dog roland = new Dog("Роланд", true);
            Dog mimi = new Dog("Мимишка", false);
            Rat rat = new Rat();
            Building inn = new Building("Дрянинингская ночлежка");
            Building.Door door = inn.new Door(){
                @Override
                public void opendatdoor(){
                    System.out.println("Дверь открылась");
                    changeState();
                }
            };
            System.out.println(inn);
            inn.setDoor(door);
            inn.setSmell(Smell.RATTY);
            System.out.println(inn);

            doc.cure(kozlik, drugs);
            neznayka.setFeel(happy);
            kozlik.setFeel(happy);
            neznayka.goTo(inn);
            kozlik.goTo(inn);
            mimi.goTo(inn);
            roland.goTo(inn);
            rat.hide(undershelf);
            kozlik.sitNDream();
            neznayka.sitNDream();
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
            minoga.receiveBadNews();
            maid.tellSmth("Незнайка недавно ушёл на прогулку", minoga);
            minoga.startPlanN(det, maid);
            kozlik.sitNDream();
            neznayka.sitNDream();
            roland.catchRat(rat);
            roland.giveRat(rat, mimi);
            //mimi.drop(rat);
            mimi.playWithRat(rat);
            maid.goTo(inn);
            det.goTo(inn);
            minoga.goTo(inn);
            door.opendatdoor();
            minoga.lookAroundForDogs(roland, mimi);
            minoga.getConcious(det, maid);
            minoga.examineDog(mimi);
            det.getFromDog(mimi, minoga);
        }
        catch (Exception e){
            throw new Exceptions.StoryException(e.getMessage());
        }
    }
}
/*






















Ураааааааааааааааа допса
как же я устал
убейте меня
 */