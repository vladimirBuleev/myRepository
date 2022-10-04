package New;

public class Calculator {
    int x;
    int y;
    Calculator(int x,int y){
        this.x=x;
        this.y=y;
    }int add(){
        return x+y;
    }int sub(){
        return x-y;
    }int mult(){
        return x*y;
    }int division(){
        return x/y;
    }void setX(int x){
        this.x=x;
    }void setY(int y){
        this.y=y;
    }
}
