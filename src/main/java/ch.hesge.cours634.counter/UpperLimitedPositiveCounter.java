package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {
    private final int MAX_NUM = 999999999;

    public UpperLimitedPositiveCounter() {
        super();
    }

    @Override
    public void inc() throws CounterException {
        if(this.cmpt > 0 || this.cmpt < MAX_NUM) {
            super.inc();
        } else {
            throw new CounterException();
        }
    }

    @Override
    public void add(int step) throws CounterException {
        super.add(step);
        if(this.cmpt < 0 || this.cmpt > MAX_NUM) {
            throw new CounterException();
        }
    }

    @Override
    public int getValue() {
        return super.getValue();
    }
}
