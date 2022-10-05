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
    }
}