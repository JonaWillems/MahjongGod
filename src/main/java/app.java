import java.util.HashMap;

/**
 * Created by Jona on 19-9-2016.
 */
public class app {
    public static void main(String[] args)
    {
        for (int i = 0; i < 12; i++)
            System.out.print(i);

        HashMap<String, String> foo = new HashMap<String, String>();
        if (foo.isEmpty())
        {
            app a = new app();
            a.returnOne();
        }

    }

    public int returnOne()
    {
        return 1;
    }


}
