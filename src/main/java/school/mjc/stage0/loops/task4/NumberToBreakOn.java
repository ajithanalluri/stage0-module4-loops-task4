package school.mjc.stage0.loops.task4;

/*
* Write a program that will consume 2 args:
* the first is number to break on, the second to iterate till,
* if number to iterate till is less than to break with -> sout("iterating till the end")
* and print all the numbers till the end, otherwise all numbers till toBreakWith.
 */
public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if(numberToGoUntil < toBreakWith)
            System.out.println("iterating till the end");
        for (int i = 1; i <= numberToGoUntil; i++) {
            if (i <= toBreakWith) {
                System.out.println(i);
            } else
                break;
        }
    }
}
