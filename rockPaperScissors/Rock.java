package rockPaperScissors;

public class Rock {
    int value;
    public Rock(int value){
        this.value=value;
        if(this.value==0){
            System.out.println("rock");
            System.out.println("DRAW");
        }else if(this.value==1){
            System.out.println("scissors");
            System.out.println("YOU WIN");
        }else if(this.value==2){
            System.out.println("paper");
            System.out.println("YOU LOSE");
        }
    }
}
