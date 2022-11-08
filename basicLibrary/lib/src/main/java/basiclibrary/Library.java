package basiclibrary;

import java.util.Arrays;
import java.util.Random;
public class Library {
    public static int[] roll(int rolls){
        int[] dice= {1,2,3,4,5,6};
        Random random = new Random();
        int[] rolled = new int[rolls];

        for(int i = 0; i < rolls; i++){
            int roll = random.nextInt(dice.length);
            rolled[i] = dice[roll];
        }
        return rolled;
    }

    public static  boolean containsDuplicates(int[] duplicate) {
        Arrays.sort(duplicate);

        boolean answer = false;

        for(int i = 0; i < duplicate.length; i++){
            for(int j = 1; j < duplicate.length; j++){
                if(duplicate[i] == duplicate[j]){
                    answer = true;
                }
                else{
                    answer = false;
                }

            }
        }
        return answer;
    }

    public static  int calculateAverage(int[] arr){
        int sum = Arrays.stream(arr).sum();
        return (sum / arr.length);
    }

    public static int[] lowestAverageArray(int[][] array){

        double currentAvg = 100;
        int[] answer = new int[10];

        for(int i = 0; i < array.length; i++){
            int sum = Arrays.stream(array[i]).sum();
            double average = (sum / array[i].length);
            System.out.println(average);
            if (average < currentAvg){
                currentAvg = average;
                answer = array[i];
            }
        }
        return answer;
    }
}