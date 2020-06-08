package javaPMCInherritanceChallenge;

public class Cars extends Vehicle {

	String gears;
	Double speed;
	
	public String getGears() {
		return gears;
	}
	public void setGears(String gears) {
		this.gears = gears;
	}
	public Double getSpeed() {
		return speed;
	}
	
	public void changeGears(int gearValue) {
		
		this.gears+=gearValue;
	}
	
	public void changeSpeed(int speedChange) {
		
		this.speed+=speedChange;
		
	}
	@Override
	public void changeGears() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void changeSpeed() {
		// TODO Auto-generated method stub
		
	}
	
}
