package Day5;

public class Program2 {

	public static void main(String[] args) {

		SaleItem mytax = new SaleItem();
		System.out.println(mytax.calculateTax(500));

		Imported myimport = new Imported();
		System.out.println(myimport.calculateTax(1000));

	}
}
