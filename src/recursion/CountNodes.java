package recursion;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class CountNodes {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);
        System.out.println(llist);
        System.out.println("Count of nodes is = " + lengthOfList(llist));
    }

    public static int lengthOfList(LinkedList list) {
        if (list.isEmpty()) {
            return 0;
        }
        list.pop();
        return 1 + lengthOfList(list);
    }
}
