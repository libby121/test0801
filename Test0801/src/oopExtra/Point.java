package oopExtra;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) throws InvalidNumException {
		//		if (x > 0) {
		//			this.x = x;
		//		} else
		//			throw new InvalidNumException(x, "invalid");
		//
		//		if (y > 0) {
		//			this.y = y;
		//		} else
		//			throw new InvalidNumException(y, "invalid");

		setX(x);
		setY(y);
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void setX(int x) throws InvalidNumException {//can it be only one method
		if (x > 0) {
			this.x = x;
		} else
			throw new InvalidNumException(x, "invalid");
	}
	public void setY(int y) throws InvalidNumException {
		if (y > 0) {
			this.y = y;
		} else
			throw new InvalidNumException(y, "invalid");

	}
}
