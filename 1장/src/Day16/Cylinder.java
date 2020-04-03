package Day16;	//p223

public class Cylinder extends Circle{
	int height;
	
	Cylinder(int r, int h){
		super(r);
		this.height = h;
	}
	
	double volume() {
		return area(r) * height;
	}
	String showCylinder() {
		return showCircle() + ", Height; " + height;
	}
}
