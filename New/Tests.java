package New;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void test(){
        Human testHuman=new Human("Vladimir","Buleev","Dmitrievich",25);
        assertEquals(25,testHuman.getAge());
        assertEquals("Buleev",testHuman.getSurName());
        assertEquals("Vladimir",testHuman.getName());
        assertEquals("Dmitrievich",testHuman.getMiddleName());

        Book testBook= new Book("The Witcher",1896,1986,"Sapkovsky");
        assertEquals("The Witcher", testBook.getBookName());
        assertEquals(1896,testBook.getPageAmount());
        assertEquals(1986,testBook.getPublicationYear());
        assertEquals("Sapkovsky",testBook.getAuthorName());

        Movie testMovie= new Movie("Seven",127,"David Fincher");
        assertEquals("Seven",testMovie.getMovieName());
        assertEquals(127,testMovie.getRunningTime());
        assertEquals("David Fincher",testMovie.getFilmDirector());

        Calculator testCalc = new Calculator(10,5);
        assertEquals(15,testCalc.add());
        assertEquals(5,testCalc.sub());
        assertEquals(50,testCalc.mult());
        assertEquals(2,testCalc.division());

        Matrix testMatrix = new Matrix(3,3);
        int[][] array = {
                {1, 2, 4},
                {2, 0, 5},
                {3, 8, 2}
        };
        testMatrix.setArrayValue(2,2,10);
        assertEquals(10,testMatrix.getArrayValue(2,2));
        testMatrix.addAnotherArray(array);
        assertEquals(12,testMatrix.getArrayValue(2,2));
        testMatrix.multiplyAnotherArray(array);
        assertEquals(24,testMatrix.getArrayValue(2,2));


    }
}