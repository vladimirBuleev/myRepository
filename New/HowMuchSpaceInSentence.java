package New;

public class HowMuchSpaceInSentence {
    String sentence;
    HowMuchSpaceInSentence(String sentence){
        this.sentence=sentence;
    }int amountSpaces(){
        int count=0;
        char[] a=this.sentence.toCharArray();
        for(int i=0;i<this.sentence.length();i++){
            if(a[i]==' '){
                count++;
            }
        }return count;
    }
}
