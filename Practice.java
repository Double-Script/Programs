import java.util.HashSet;
import java.util.Iterator;

public class Practice {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);

        //search content
        if(set.contains(2)){
            System.out.println("it is there");
        }
        if (!set.contains(5)){
            System.out.println("it is not there");
        }
        //remove
        set.remove(2);

        System.out.println(set);

        System.out.println(set.size());

        //itorator
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
