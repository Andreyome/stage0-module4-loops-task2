package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number=0;
        int result=0;
        while (number<=printToInclusive){
            result=result*number++;
            System.out.println(result);
        }
    }
}
