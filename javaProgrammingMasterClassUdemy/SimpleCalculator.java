package javaProgrammingMasterClassUdemy;

public class SimpleCalculator {
	
	double firstNumber;
	double secondNumber;
	
	public double getSecondNumber() {
		return secondNumber;
	}
	public double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	
	public double getAdditionResult() {
		
		return this.getFirstNumber()+this.getSecondNumber();
		
	}
	
	public double getSubtractionResult() {
		
		return this.getFirstNumber()-this.getSecondNumber();
		
	}
	
	public double getMultiplicationResult() {
		
		return this.getFirstNumber()*this.getSecondNumber();
		
	}
	
	public double getDivisionResult() {
		
		if (this.getSecondNumber()==0)
			
			return 0;
		
		else
			return this.getFirstNumber()/this.getSecondNumber();
		
	}
	

}
