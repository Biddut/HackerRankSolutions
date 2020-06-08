package javaPMCInherritanceChallenge;

public class Printer {
	


	private int tonerLevel;
	private int pagePrinted=0;
	private boolean isDuplex;
	
	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getPagePrinted() {
		return pagePrinted;
	}

	public boolean isDuplex() {
		return isDuplex;
	}
	
	public Printer(int tonerLevel, int pagePrinted, boolean isDuplex) {
	
		if(this.tonerLevel>=1 & this.tonerLevel<=100){
			
			this.tonerLevel = tonerLevel;
		}
		
		else this.tonerLevel=-1;
		
		this.pagePrinted = pagePrinted;
		this.isDuplex = isDuplex;
	}
	
	public int fillToner(int tonerAmount) {
		
		if(this.tonerLevel>=1 & this.tonerLevel<=100){
			
			if (this.tonerLevel+tonerAmount>100) {
				
				return -1;
			}
					
			return this.tonerLevel+=tonerAmount;
		}
		
		else return -1;
	}
	
	public void print(int pageToPrint) {
				
			this.pagePrinted+=pageToPrint;
			
			System.out.println("printing....successful"+pagePrinted);
		}
	
}
