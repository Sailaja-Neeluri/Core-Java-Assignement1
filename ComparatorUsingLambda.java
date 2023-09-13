package program.com.exercise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			 

	        List<String> strings = Arrays.asList("Pranavi","Yamini","Pavani","Sailaja");

	        // Sort the list based on string length using a lambda expression
	        strings.sort(Comparator.comparingInt(str->str.length()));

	 

	        // Print the sorted list
	        strings.forEach(str->System.out.println(str));

	 

	    

	}

}
