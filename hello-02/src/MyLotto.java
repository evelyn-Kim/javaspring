import java.util.ArrayList;
import java.util.HashSet;

public class MyLotto {
	private ArrayList<Integer> lotto = null;
	public void makeLotto() {
		HashSet<Integer> hs = new HashSet<Integer>();
		while(hs.size()<6) {
			int num = (int)(Math.random()*45+1);
			hs.add(num);
		}//end while
		lotto = new ArrayList<Integer>(hs);
	}

	public ArrayList<Integer> getLotto() {
		return lotto;
	}

}
