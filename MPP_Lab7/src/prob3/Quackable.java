package prob3;

public interface Quackable {
	default void quack() {
		System.out.println("  quacking");
	}
}
