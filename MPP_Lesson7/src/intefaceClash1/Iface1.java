package intefaceClash1;

public interface Iface1 {
	default int myMethod(int x) {
		return 2 * x;
	}
}
