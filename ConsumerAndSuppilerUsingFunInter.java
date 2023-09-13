package program.com.exercise.functionalinterfaces;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerAndSuppilerUsingFunInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer = str->System.out.println(str);
		consumer.accept("Cognizant is MNC Company");

		Supplier<String> supplier = ()->{
			LocalDateTime date = LocalDateTime.now();
			DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			return date.format(dateformat);
		};
		System.out.println(supplier.get());
	}

	

}
