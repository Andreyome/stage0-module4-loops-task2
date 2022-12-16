package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int number=0;
        while (number<=printTillInclusive){
            if (number%2==0){
                System.out.println(number);
            }
            number++;
        }
    }
}
