import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CatTest {
    Cat cat=new Cat();
    @Test
    public void testAdd(){
        int result =cat.add(4,5);

        assertEquals(9,result);
        
    }



}
