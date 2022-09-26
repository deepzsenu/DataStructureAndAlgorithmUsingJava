package gfgJavaCollections.basic.generic;
class MyGen<T>{
	T x;
	static int count;
	MyGen(){
		count++;
	}
}
public class CheckGen {
	public static void main(String args[]) {
		MyGen<Integer> m = new MyGen<>();
		MyGen<String> m2 = new MyGen<>();
		System.out.println(MyGen.count);
	}

}
