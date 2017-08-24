import com.sun.tools.javac.util.List;

import java.util.ArrayList;

/**
 * Created by benaissa on 8/24/17.
 */
public class Main {
    public static void main(String [] args){

        ArrayList<String> list = new ArrayList<String>();
        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println(list);
        list.add("Alaska");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        String states = list.get(1);
        System.out.println("The second state is: "+states);

        int pos = list.indexOf("Alaska");
        System.out.println(pos);



    }
}
