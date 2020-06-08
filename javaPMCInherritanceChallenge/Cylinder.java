package javaPMCInherritanceChallenge;

public class Cylinder extends Circle {
	
	private double height;

	public Cylinder(double radius,double height) {
		super(radius);
		
		if (height>0)
			this.height=height;
		else height=0;

	}
	
	public double getHeight() {
		return height;
	}

	
	public double getVolume() {
		
		return this.getArea()*this.getHeight();
	}
	

}
