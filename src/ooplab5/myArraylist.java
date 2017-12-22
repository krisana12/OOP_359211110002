package ooplab5;

import java.util.ArrayList;

public class myArraylist {
    public static void main(String[] args){
    //ArrayList
        ArrayList list = new ArrayList();
        String name = "SKY";
        list.add(name);
        System.out.println(list);
        list.add("NOT");
        list.add("MOS");
        System.out.println(list);
        list.add(index:2, element: "ADAM");
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add(10.10);
        System.out.println(list);
        list.remove(o: "MOS");
        System.out.println(list);
        list.remove(index:3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.get.indexOf("MOS"));
    }//main
}//class
