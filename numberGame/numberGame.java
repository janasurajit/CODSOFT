
import java.util.Scanner;

class numberGame{

    public static int guess_number() {
        int user_input;
        int i = 1;
        int count = 0;

        double random = Math.random() * 100;
        int num = (int) random;
        System.out.println(num);

        System.out.println("Guess the number----");
        System.out.println("You have only 10 guesses");
        
        try( Scanner sc = new Scanner(System.in)){
        while (i <= 10) {
            user_input = sc.nextInt();
            if (user_input == num) {
                count++;
                System.out.println("you have sccessfully guess the number in " + count + " times");
                break;
            } else if (user_input > num) {
                System.out.println("try lower number");
                count++;
                i++;
            } else {
                System.out.println("try higher number");
                count++;
                i++;
            }
            
            
        }
    
        if (i <= 10) {
            System.out.println("you sucessfully won");
            return 1;
        } else {
            System.out.println("you loose");
            return 0;
        }
    }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int decision, score = 0;
        do {
            score += guess_number();
            System.out.println("Do you want to play again!--->  then press 1 otherwise 0");
            decision = sc.nextInt();
            
            sc.close();
        } while (decision == 1);
        System.out.println("score = " + score);
    }
}
