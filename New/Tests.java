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
    }
}