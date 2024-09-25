import java.util.*;

class Collections {
    public static void main(String[] args) {
        LinkedList<Integer> lobj = new LinkedList<Integer>();
        lobj.add(10);
        lobj.add(20);
        lobj.add(30);
        lobj.add(40);
        System.out.println(lobj);
        lobj.addFirst(5);
        System.out.println(lobj);
        Boolean bret = true;
        if (lobj.contains(30)) {
            System.out.println("LL contains 30 init");
        } else {
            System.out.println("There are no 30 in LL");
        }
        System.out.println("Index of 30 is :"+lobj.indexOf(30));
        Iterator iobj = lobj.iterator();
        while (iobj.hasNext()) {
            System.out.println(iobj.next());
        }
        lobj.clear();
    }

}
