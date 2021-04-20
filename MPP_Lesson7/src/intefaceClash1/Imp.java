package intefaceClash1;

public class Imp implements Iface1, Iface2 {

	@Override
	public int myMethod(int x) {
		return Iface1.super.myMethod(x);
	}
	
}
