package enumtype;

public enum Constant {

	COMPONY("Google"),
	SALES_TARGET(20000000);
	private String val1;
	private int val2;
	
	Constant(String c){
		
		val1=c;
	}
	Constant(int s){
		val2=s;
	}
	
	public String getVal1() {
		return val1;
	}
	public int getVal2() {
		return val2;
	}
	
	public static void main(String[] args) {
		System.out.println(Constant.COMPONY.val1);
		System.out.println(Constant.COMPONY.val2);
		
	}
}
