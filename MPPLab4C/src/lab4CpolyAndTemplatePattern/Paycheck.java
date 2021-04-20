package lab4CpolyAndTemplatePattern;

/** Immutable */
final public class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	private String emId;
	
	public Paycheck(String emId,double grossPay, Tax fica, Tax state, Tax local, Tax medicare, Tax socialSecurity) {
		this.grossPay = grossPay;
		this.fica = fica.getVal();
		this.state = state.getVal();
		this.local = local.getVal();
		this.medicare = medicare.getVal();
		this.socialSecurity = socialSecurity.getVal();
		this.emId=emId;
	}

	

	public void print() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Employee ID: "+emId+"\n"+"Paystub: \n " + "  Gross Pay: " + grossPay + "\n" + "  Fica: " + fica + "\n" + "  State: " + state
				+ "\n" + "  Local: " + local + "\n" + "  Medicare: " + medicare + "\n" + "  Social Security: "
				+ socialSecurity + "\n" + "  NET PAY: " + getNetPay();
	}

	public double getNetPay() {
		return grossPay - grossPay * fica - grossPay * state - grossPay * local - grossPay * medicare
				- grossPay * socialSecurity;
	}
}
