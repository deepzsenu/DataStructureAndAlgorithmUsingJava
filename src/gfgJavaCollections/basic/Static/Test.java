package gfgJavaCollections.basic.Static;

public class Test {
    public static void main(String[] args) {
        Player p1= new Player("azhar");
        Player p2 =  new Player("deepak");
        p1.printDetails();
        p2.printDetails();
        System.out.println(Player.playerCount); // calling player count without creating object

        System.out.println();

    }
}
