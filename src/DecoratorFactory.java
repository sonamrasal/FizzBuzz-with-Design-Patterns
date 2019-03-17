
public class DecoratorFactory {

	public static Result getDecoratedResult(Result coreResult) {
		Result decoratedResult = coreResult;
		if (isPrime(coreResult.number)) {
			decoratedResult = new PrimeDecorator(decoratedResult);
		}
		if (isMegaPrime(coreResult.number)) {
			decoratedResult = new LeftMegaPrimeDecorator(decoratedResult);
		}
		return decoratedResult;
	}

	private static boolean isPrime(int number) {
		if (1 == number || 0 == number) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean isMegaPrime(int number) {
		int divisor = 1000;
		while (divisor > 1) {
			int remainder = number % divisor;
			if (!isPrime(remainder)) {
				return false;
			}
			divisor = divisor / 10;
		}
		return true;
	}

}
