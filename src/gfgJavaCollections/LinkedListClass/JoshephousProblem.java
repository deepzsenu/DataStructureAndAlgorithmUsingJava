package gfgJavaCollections.LinkedListClass;

import java.util.Iterator;
import java.util.LinkedList;

public class JoshephousProblem {
    static int josephus(int n, int k)
    {
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            list.add(i);
        }

        Iterator<Integer> it = list.iterator();

        while(list.size()>1)
        {
            int count= 0;

            while(count<k)
            {
                while(it.hasNext() && count<k)
                {
                    it.next();
                    count++;
                }

                if(count<k)
                {
                    it= list.iterator();
                    it.next();

                    count++;
                }
            }
            it.remove();
        }

        return list.getFirst();
    }

    public static void main (String[] args) {

        int n=7,k=3;

        int ans= josephus(n,k);

        System.out.println(ans);
    }
    /*static int getValue(int n , int k ){
        LinkedList<Integer> li = new LinkedList<>();
        for (int i =0 ; i<n; i++){
            li.add(i);
        }

        System.out.println(li);
        Iterator<Integer> it = li.iterator();

        while(li.size()>1){
            int count= 0;
            while (count<k){
                while (it.hasNext() && count<k){
                    it.next();
                    count++;
                }
                if (count<k){
                    it = li.iterator();
                    it.next();
                    count++;
                }

                }
            if (li.size()>1){
                it.remove();}
            else{
                return li.get(0);
            }
        }
        return li.get(0);
    }
    public static void main(String[] args) {
        int  n = 7;
        int k = 2;
        System.out.println(getValue(n,k));
    } */
}
