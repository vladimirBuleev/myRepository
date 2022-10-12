package rockPaperScissors;
import java.util.Scanner;
public class UserInput {
    String UserAnswer;
    String getUserAnswer(){
        Scanner scan = new Scanner(System.in);
        this.UserAnswer= scan.nextLine();
        return this.UserAnswer;
    }
}
