package New;

public class Matrix {
    int[][] twoDimArray;
    int x;
    int y;
    Matrix(int x,int y){
        this.x=x;
        this.y=y;
        this.twoDimArray=new int[x][y];
    }void setArrayValue(int x,int y,int value){
        this.twoDimArray[x][y]=value;
    }int getArrayValue(int x,int y){
        return twoDimArray[x][y];
    }int[][] addAnotherArray(int[][]newArray){
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                this.twoDimArray[i][j]=this.twoDimArray[i][j]+newArray[i][j];
            }
        }return twoDimArray;
    }int[][]multiplyAnotherArray(int[][]newArray){
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                this.twoDimArray[i][j]=this.twoDimArray[i][j]*newArray[i][j];
            }
        }return twoDimArray;
    }public String toString(){
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(twoDimArray[i][j]+" ");
            }
            System.out.println();
        }return " ";
    }
}
