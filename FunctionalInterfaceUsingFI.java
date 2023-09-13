package program.com.exercise.functionalinterfaces;
import java.util.function.Function;

public class FunctionalInterfaceUsingFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Function<String,Integer> function = (str)->str.length();
			System.out.println(function.apply("Sailaja"));

			Function<String,String> function1 = (str)->str.toLowerCase();
			System.out.println(function1.apply("SAILAJA"));

	}

}
