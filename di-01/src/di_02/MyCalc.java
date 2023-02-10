package di_02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyCalc {
	
	private double result = 0.0;
	
	@Autowired
	private MyLog log;
	
	public void plus(int i) {
		result += i;
	}

	public void minus(int i) {
		result -= i;
	}

	public double getResult() {
		//결과출력
		log.log("result="+result);
		return result;
	}

}
