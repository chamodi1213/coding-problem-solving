import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args){
//        LinkedList<Integer> list1 = new LinkedList<>();
//        Iterator<Integer> iterator = list1.iterator();
//        while(iterator.hasNext()){
//
//        }
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(0);
        System.out.println(reverseList(list));
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        Collections.reverse(list);
        return list;
//        LinkedList<Integer> list1 = new LinkedList<>();
//        while(!list.isEmpty()){
//            list1.add(list.removeLast());
//        }
//        return list1;
    }
}
