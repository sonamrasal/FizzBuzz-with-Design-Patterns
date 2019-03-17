
public class ResultFactory {

	public static Result getResult(int number) {
		if (number % 3 == 0 && number % 5 == 0) {
			return new FizzBuzz(number);
		}
		if (number % 3 == 0) {
			return new Fizz(number);
		}
		if (number % 5 == 0) {
			return new Buzz(number);
		}
		return new NoFizzBuzz(number);
	}

}
