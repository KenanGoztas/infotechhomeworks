package javahomework15xintefacexiterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestMain4 {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(2);
        list1.add(13);
        list1.add(56);
        list1.add(23);
        list1.add(45);
        list1.add(14);
        list1.add(14);
        list1.add(40);
        ListIterator<Integer> li =list1.listIterator();
//önce next ile sonuncu elemana kadar gittim.
        while (li.hasNext()) {
            System.out.println(li.next());
        }
//daha sonra son elemandan geriye doğru yazdırdım
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }

}
