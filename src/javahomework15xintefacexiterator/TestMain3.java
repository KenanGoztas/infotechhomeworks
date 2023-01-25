package javahomework15xintefacexiterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestMain3 {
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

        Iterator<Integer> iterator=list1.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            if (i<20 || i>40) { //buraya iterator.next() geçemiyoruz??
                iterator.remove();
            }
        }
        System.out.println(list1);


    }
}
