package pkg;
// added skeleton methods for the class
public class B2D {
	public static void main(long bin) {

		System.out.println(bin);
		expandBinary();
		System.out.println(dec);
	}
	
	// Expands the Binary input into a Decimal output
	public void expandBinary()
	{
		int i = 0;
		long dec;
		while (i != bin.len()) {
			dec += bin[bin.len() - i] * (2 ** i);
		}
	}
}
