

public class PrimeDecorator extends ResultDecorator {

	public PrimeDecorator(Result toDecorate) {
		super.toDecorate = toDecorate;
	}

	@Override
	public String showMe() {
		return toDecorate.showMe() + " Prime";
	}

}
