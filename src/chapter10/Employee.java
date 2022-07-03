package chapter10;

public abstract class Employee  implements Payable{
	private String firstName;
	private String lastName;
	private String ssn;
	 public Employee(String firstName, String lastName, String ssn){
		 this.firstName= firstName;
		 this.lastName=lastName;
		 this.ssn=ssn;
	 }
	 
	 public void setFirstName(String firstName) {
		 this.firstName=firstName;
	 }
	 
	 public String getFirstName()
	   {
	      return firstName;
	   } 

	   // return last name
	   public String getLastName()
	   {
	      return lastName;
	   } 

	   // return social security number
	   public String getssn()
	   {
	      return ssn;
	   } 

	   // return String representation of Employee object
	   @Override
	   public String toString()
	   {
	      return String.format("%s %s%nsocial security number: %s", 
	         getFirstName(), getLastName(), getssn());
	   } 

	   // abstract method must be overridden by concrete subclasses
	   public abstract double earnings(); // no implementation here
		
		@Override
		public double getPaymentAmount()
		{
			return earnings();
		}
}
