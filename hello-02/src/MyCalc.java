

public class MyCalc {
	private static Integer answer = 0;
	public void plus(int i) {
		answer += i;
	}

	public void minus(int i) {
		answer -= i;
	}

	public long getResult() {
		return answer;
	}

}