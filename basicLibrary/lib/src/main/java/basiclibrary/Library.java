package basiclibrary;

import java.util.Arrays;
import java.util.Random;
public class Library {
    public int[] roll(int rolls){
        int[] dice= {1,2,3,4,5,6};
        Random ran = new Random();
        int[] rolled = new int[rolls];

        for(int i = 0; i < rolls; i++){
            int roll = ran.nextInt(dice.length);
            rolled[i] = dice[roll];
        }
        System.out.println(Arrays.toString(rolled));
        return rolled;
    }

    public boolean containsDuplicates(int[] duplicate) {
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

    public int calculateAverage(int[] arr){
        int sum = Arrays.stream(arr).sum();
        return (sum / arr.length);
    }

    public int[] lowestAverageArray(int[][] matrix){

        int currentAvg = 100;
        int[] answer = new int[10];

        for(int i = 0; i < matrix.length; i++){
            int sum = Arrays.stream(matrix[i]).sum();
            int average = (sum / matrix[i].length);

            if (average <= currentAvg){
                currentAvg = average;
                answer = matrix[i];
            }
        }
        return answer;
    }
}