package ua.project_calc;

public class SumCalculator {

    public static int sum(int number){
        int result = 0;

        if(number <= 0){
            throw new IllegalArgumentException("Число повинно бути більше нуля!");
        }

        for (int i = 0; i <= number; i++) {
            result += i;
        }

        return result;

    }
}
