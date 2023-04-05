package school.mjc.stage0.loops.task4;

/*
 * Write a program that will print all numbers from one up to given(inclusive), skipping each 3rd.
 */
public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        for (int i = 0; i <= lastPrinted; i++) {
            if (i % 3 != 0)
                System.out.println(i);
        }
    }
}
