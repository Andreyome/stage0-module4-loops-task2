package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power>0){
            int number = 1;
            while (number<=power){
                System.out.println((int)(Math.pow(2,number++)));
            }
        }
    }
}
