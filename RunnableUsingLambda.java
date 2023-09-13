package program.com.exercise;

public class RunnableUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a new thread using a lambda expression

        Thread thread = new Thread(() -> {

            System.out.println("Lambda Runnable in action!");

        });

        // Start the thread

        thread.start();
	}

}
