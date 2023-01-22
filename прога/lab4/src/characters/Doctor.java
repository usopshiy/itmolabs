package characters;

import objects.*;

import java.util.ArrayList;

public class Doctor extends Person{
    public Doctor(String name) {
        super(name);
    }
    public void giveReceipts(ArrayList<String> s){
        class Receipt{
            private String drugName;
        }
        System.out.println(this.getName() + " выписвает кучу лекарств, " +
                "среди которых медикаменты как для приема внутрь, " +
                "так и наружные:");
        for(String string : s){
            System.out.print(string + ", ");

        }
        System.out.print("\n");
    }
    public void cure(Person p, ArrayList<String> s){
        giveReceipts(s);
        p.setState(new State("Выздоравливает"));
        System.out.println("Лечение " + p.getName()+ " проходит успешно, и через 2 недели "
        + this.getName() + " разрешает ему вставать ");
        p.setState(new State("нормальное"));
        System.out.println("Еще через неделю " + this.getName() + " сказал, что" +
                " дальнейшие посещения его не будут нужны, так как больной полностью выздоровел; " +
                "ему будет необходимно лишь получше питаться чтоюы восстановить силы ");
    }
}
