package aop03;

import org.springframework.stereotype.Component;

@Component
public class MyCalc {
	
	private double result ;

	public double plus(int i) {
		result += i;
		return result;
	}

	public double multiple(int i) {
		result *= i;
		return result;
	}

	public double minus(int i) {
		result -= i;
		return result;
	}

	public double getResult() {
		return result;
	}
}
