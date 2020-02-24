package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args) throws CounterException {
        Counter cmpt1 = new Counter();
        UpperLimitedPositiveCounter cmpt2 = new UpperLimitedPositiveCounter();

        System.out.println("Mon premier compteur  => " + cmpt1.getValue());
        System.out.println("Mon second compteur  => " + cmpt2.getValue());

        cmpt1.inc();
        cmpt2.inc();

        System.out.println("Mon premier compteur incrémenté => " + cmpt1.getValue());
        System.out.println("Mon second compteur incrémenté => " + cmpt2.getValue());

        cmpt1.add(-2);
        cmpt2.add(-2);

        System.out.println("Mon premier compteur qui sera négatif => " + cmpt1.getValue());
        System.out.println("Mon second compteur qui sera négatif => " + cmpt2.getValue());



    }
}
