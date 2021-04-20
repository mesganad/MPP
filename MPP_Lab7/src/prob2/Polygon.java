package prob2;

public interface Polygon extends ClosedCurve {
	
	double[] getSides();
	@Override
	default double computePerimeter() {
		double[] sides=getSides();
		double perimeter=0.0;
		for(double s:sides) {
			perimeter+=s;
		}
		return perimeter;
	}

}
