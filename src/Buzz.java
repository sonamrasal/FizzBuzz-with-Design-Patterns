
public class Buzz extends Result {

	public Buzz(int number) {
		super.number = number;
	}

	@Override
	public String showMe() {
		return "Buzz";
	}
}
