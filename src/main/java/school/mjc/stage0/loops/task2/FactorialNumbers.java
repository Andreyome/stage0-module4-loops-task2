package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number=1;
        int result=1;
        while (number<=printToInclusive){
            result=result*number++;
            System.out.println(result);
        }
    }
}
