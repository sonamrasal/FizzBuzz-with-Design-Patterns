

public class LeftMegaPrimeDecorator extends ResultDecorator {

	public LeftMegaPrimeDecorator(Result toDecorate) {
		this.toDecorate = toDecorate;
	}
	
	@Override
	public String showMe() {
		return toDecorate.showMe() + " LeftMegaPrime";
	}

}
