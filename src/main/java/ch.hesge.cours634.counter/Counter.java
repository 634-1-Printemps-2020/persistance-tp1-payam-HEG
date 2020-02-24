package ch.hesge.cours634.counter;

public class Counter implements ICounter {

    int cmpt = 0;
    @Override
    public void inc() throws CounterException {
        cmpt++;
    }

    @Override
    public void add(int step) throws CounterException {
        cmpt += step;
    }

    @Override
    public int getValue() {
        return cmpt;
    }
}
