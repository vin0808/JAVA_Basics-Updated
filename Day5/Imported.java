package Day5;

public class Imported implements Taxable {

	@Override
	public double calculateTax(double D) {

		System.out.println("Imported: calculateTax: " + (D = 50 + D));

		return D;
	}
}
