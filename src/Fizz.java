
public class Fizz extends Result {

	public Fizz(int result) {
		super.number = result;
	}

	@Override
	public String showMe() {
		return "Fizz";
	}
}
