package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
for (int i=2;i<=printToInclusive;i++){
    int mark=0;
    for (int j=2;j<i;j++){
        if (i%j ==0){
            mark = 1;
            break;
        }
    }
    if (mark==0){
        System.out.println(i);
    }
}
    }
}
