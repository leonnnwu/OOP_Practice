/**
* Open-close principle - good example
* source: http://www.oodesign.com/open-close-principle.html
* Design Pattern: Decorator pattern, Factory pattern, Observer pattern
*/

class GraphicEditor {
	public void drawShape(Shape s) {
		s.draw();
	}
}

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{
	public void draw() {
		//draw the rectangle
	}
}