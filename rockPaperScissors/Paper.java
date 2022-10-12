package rockPaperScissors;

public class Paper {
    int value;
    public Paper(int value){
        this.value=value;
        if(this.value==0){
            System.out.println("rock");
            System.out.println("YOU WIN");
        }else if(this.value==1){
            System.out.println("scissors");
            System.out.println("YOU LOSE");
        }else if(this.value==2){
            System.out.println("paper");
            System.out.println("DRAW");
        }
    }
}
