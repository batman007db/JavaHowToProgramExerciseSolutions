package chapter10;

public class PayableInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payable[] payableObjects= new Payable[6];
		
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		payableObjects[2] = new CommissionEmployee("John", "Smith",
			"111-11-1111", 4000.00, 0.06);
		payableObjects[3] = new BasePlusCommissionEmployee("John", "Smith",
			"111-11-1112", 600.00, 0.04, 200);
		payableObjects[4] = new HourlyEmployee("John", "Smith",
			"111-11-1113", 40, 10);
		payableObjects[5] = new SalariedEmployee("Lisa", "Barnes",
			"111-11-1114", 1200.00);
		
		System.out.printf("Invoices and Employees processed polymorphically:%n%n");

		// generically process each element in array payableObjects
		for (Payable currentPayable : payableObjects)
		{
			System.out.println(currentPayable);

			// determine whether element is a BasePlusCommissionEmployee
			if (currentPayable instanceof BasePlusCommissionEmployee)
			{
				// downcast Employee reference to basePlusCommissionEmployee reference
				BasePlusCommissionEmployee employee
					= (BasePlusCommissionEmployee) currentPayable;

				employee.setBaseSalary(1.10 * employee.getBaseSalary());

				System.out.printf(
					"new base salary with 10%% increase is: $%,.2f%n",
					employee.getBaseSalary());
			}

			// output currentPayable and its appropriate payment amount
			System.out.printf("%s: $%,.2f%n%n",	"payment due", 
				currentPayable.getPaymentAmount());
		}
		
	}

}
