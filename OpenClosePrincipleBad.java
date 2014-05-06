/**
* Bad Open-close principles example.
* Source: http://www.oodesign.com/open-close-principle.html
*/

class Graphic Edition {

	public void drawShape(Shape s) {
		if(s.m_type == 1) {
			drawRectangle(s);
		} else if(s.m_type == 2) {
			drawCircle(s);
		}
	}

	public void drawRectangle(Rectangle r) {};
	public void drawCircle(Circle c) {};
}

class Shape {
	int m_type;
}

class Rectangle extends Shape {
	Rectangle() {
		super.m_type = 1;
	}
}

class Circle extends Shape {
	Circle() {
		super.m_type = 2;
	}
}