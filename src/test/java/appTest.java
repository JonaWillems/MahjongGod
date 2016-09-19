import static org.junit.Assert.*;

/**
 * Created by Jona on 19-9-2016.
 */
public class appTest {
    @org.junit.Test
    public void returnOne() throws Exception
    {
        app a = new app();
        assertEquals(a.returnOne(), 1);
    }

}