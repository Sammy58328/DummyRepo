
@FunctionalInterface
interface Abc {
	int sum(int a, int b);
}

public class LambdaEx {

	public static void main(String s[]) {

		Abc addition = (a, b) -> (a + b);

		int result = addition.sum(3,5);

		System.out.println("The sum is - "+ result);
	}

}
