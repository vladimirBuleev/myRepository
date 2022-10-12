package rockPaperScissors;

public class Game {
    public Game(){
        UserInput answer = new UserInput();
        String userAnswer= answer.getUserAnswer();
        RandomValue value = new RandomValue();
        int random= value.getRandomValue();
        if (userAnswer.equalsIgnoreCase("rock")){
            Rock rock = new Rock(random);
        }else if (userAnswer.equalsIgnoreCase("paper")){
            Paper paper = new Paper(random);
        }else if (userAnswer.equalsIgnoreCase("scissors")){
            Scissors scissors = new Scissors(random);
        }else{
            System.out.println("wrong");
        }
    }
}
