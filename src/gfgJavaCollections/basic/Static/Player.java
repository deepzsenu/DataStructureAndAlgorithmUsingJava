package gfgJavaCollections.basic.Static;

/*====================================================
RULES
=====================================================
1. static members can be accessed without creating class.
2. static methods cannot access non static members.
3. non static members can access static members .
4. static members do not have access to this reference.
 */

public class Player {

    String name ;
    int id;
    static int playerCount = 0;
    Player(String name){
        this.name = name;
        id  = ++playerCount;
    }
    void printDetails(){
        System.out.println(id+" :"+name);
    }
}
