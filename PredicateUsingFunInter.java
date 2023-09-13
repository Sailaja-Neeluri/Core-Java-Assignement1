package program.com.exercise.functionalinterfaces;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateUsingFunInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> predicate = num->num%2==0;
		System.out.println(predicate.test(23));

		Predicate<String> predicate1 = str->str.length()>5;
		System.out.println(predicate1.test("Sailaja"));

		List<String> names = Arrays.asList("Sailaja","Pavani","Yamini","Pranavi","jyothi","Sam");
		BiPredicate<String,Integer> bipredicate = (str,len)->len%2==0 && len>5;
		List<String> res = names.stream()
				                   .filter(str->bipredicate.test(str,str.length()))
				                   .collect(Collectors.toList());		
		System.out.println(res);

	}

}
