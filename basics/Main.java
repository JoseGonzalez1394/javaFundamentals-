package basics;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Main {
    public static String plurarizevideoGame(String videoGame, int count) {

        if (count > 1) {
            return "I own " + count + " " + videoGame + "s";
        } else {
            return "I own " + count + " " + videoGame;
        }
    }

    public static String flipNHeads(int attempts) {
        int counter = 0;
        int totalCounter = 0;

        while (counter < attempts) {
            totalCounter++;
            if (Math.random() < .5) {
                System.out.println("tails");
                counter = 0;
            }else {
                counter++;
                System.out.println("heads");
            }
        }
        if (totalCounter > 1) {
            return ("It took " + totalCounter + " " + "flips to flip" + " " + attempts + " heads in a row.");
        }else{
            return ("It took " + totalCounter + " " + "flip to flip" + " " + attempts  + " " + "head in a row.");
        }
    }

    public static void clock() throws InterruptedException{
        while (true){
            LocalTime now = LocalTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(time);
            TimeUnit.SECONDS.sleep(1);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(plurarizevideoGame("video game", 12));
        System.out.println(plurarizevideoGame("video game", 1));
        System.out.println(flipNHeads(5));
        clock();
    }
}