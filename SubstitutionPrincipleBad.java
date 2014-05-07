/**
* Substituation principle (Bad example)
* Source: www.oodesign.com
*
* Idea: This principle is just an extension of the Open Close Principle
* and it means that we must make sure that new derived classes are extending
* the base classes without changing their behavior.
*/

class Rectangle {
	protected int m_width;
	protected int m_height;

	public void setWidth(int width) {
		m_width = width;
	}

	public void setHeight(int height) {
		m_height = height;
	}

	public int getWidth() {
		return m_width;
	}

	public int getHeight() {
		return m_height;
	}

	public int getArea() {
		return m_width * m_height;
	}
}

class Square extends Rectangle {
	public void setWidth(int width) {
		super.m_width = width;
	}

	public void setHeight(int height) {
		super.m_height = height;
	}
}

class LspTest {
	private static Rectangle getNewRectangle() {
		// int can be an object returned by some factory
		return new Square();
	}

	public static void main(String args[]) {
		Rectangle r = LspTest.getNewRectangle();
		r.setWidth(5);
		r.setHeight(10);

		// user knows that r it's a rectangle.
		// It assumes that he's able to set the width and height as for the base class

		System.out.println(r.getArea);
		// now he's surprised to see that area is 100 instead of 50.
	}
}