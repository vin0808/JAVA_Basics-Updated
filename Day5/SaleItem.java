package Day5;

public class SaleItem implements Taxable {

	@Override
	public double calculateTax(double D) {
		System.out.println("SalesItem: calculateTax: " + (D = 30.78 + D));
		return D;
	}
}
