package jdbc01;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		while(hs.size()<3) {
			int r = (int)(Math.random()*35+1);
			hs.add(r);
		}
		System.out.println( hs );
	}
}




