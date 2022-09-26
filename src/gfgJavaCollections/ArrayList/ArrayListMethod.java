package gfgJavaCollections.ArrayList;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<>();
        li.add("deepak");
        li.add("kumar");
        li.add("saxena");
        System.out.println(li);
        li.add(1,"trashi"); // add an element at index 1
        System.out.println(li);
        int n = li.size();// return length of list
        System.out.println(n);

        //contains is simple linear search method
        li.remove(2);
        System.out.println(li.contains("trashi"));
        li.remove("saxena");
        System.out.println(li.contains("saxena"));

        //get gives item at given index

        System.out.println(li.get(1));
        System.out.println(li.indexOf("trashi"));
        System.out.println(li.lastIndexOf("trashi"));

        li.add(1,"of");
        li.set(1,"loves"); 
        System.out.println(li);





    }
}
