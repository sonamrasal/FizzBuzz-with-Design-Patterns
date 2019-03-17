public abstract class Result {
	protected int number;

	public String show() {
		Result result = DecoratorFactory.getDecoratedResult(this);
		return result.showMe();
	}

	protected abstract String showMe();

}
