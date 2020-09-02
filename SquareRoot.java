package calculator;
import java.util.*;
public class SquareRoot<T> {

	T number;
	
	
	public SquareRoot(T number){
		this.number=number;
	}
	
	public double findSquareRoot(double number){
		
		return Math.sqrt(number);
		
	}
	
	
	
}
