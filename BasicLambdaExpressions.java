package program.com.exercise;

public class BasicLambdaExpressions {


		interface A{
			int sum(int x,int y);
		}

		interface B{
			String upperCase(String x);
		}

	 

		public static void main(String[] args) {

			A i = (a,b)->a+b;
			System.out.println(i.sum(20, 25));

			B s = str->str.toUpperCase();
			System.out.println(s.upperCase("Sailaja"));
		}

	 

	

}
