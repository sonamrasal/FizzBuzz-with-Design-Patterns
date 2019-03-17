
public class NoFizzBuzz extends Result {

	public NoFizzBuzz(int number) {
		super.number = number;
	}

	@Override
	public String showMe() {
		return String.valueOf(number);
	}
	
}
