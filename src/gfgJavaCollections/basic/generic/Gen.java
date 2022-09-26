package gfgJavaCollections.basic.generic;

public class Gen<T,S>{
	T x;
	S y;
	Gen(T x, S y){
		this.x = x;
		this.y = y;
	}
}

class Test{
	public static <T>int checkData(T arr[], T n){
		int res = 0;
		for(T e:arr) {
			if(e == n) {
				res++;
			}
		}
		return res;
	}
	public static void main(String args[]) {
//		Gen<Integer, Integer> g = new Gen(10,20);
//		System.out.println(g.x+" " +g.y);
		Integer arr[] = {10,20,30,40,10,10,38};
		Integer x = 10;
		System.out.println(checkData(arr, x));
	}
}