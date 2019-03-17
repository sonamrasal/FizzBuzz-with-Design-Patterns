
public class FizzBuzzApplication {

	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			Result result = ResultFactory.getResult(i);
			System.out.println(result.show());
		}
	}

}
