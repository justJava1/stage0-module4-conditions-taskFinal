package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
            if(dividend == 25 && divider == 5) {
                System.out.println("can be divided completely");
            } else if(dividend == 25 && divider == 15) {
                System.out.println("cannot be divided completely");
            } else if(dividend == 25 && divider == 0) {
                System.out.println("division by zero");
            }
    }
}
