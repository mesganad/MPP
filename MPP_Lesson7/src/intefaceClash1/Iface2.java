package intefaceClash1;

public interface Iface2 {
	default int myMethod(int x) {
		return x + 1;
	}
}


