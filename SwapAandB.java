class SwapAandB{
		int a = 10;
	int b = 20;
	 void Swap(){
	this.a = this.a + this.b;
	this.b = this.a - this.b;
	this.a = this.a - this.b;
	System.out.println("the vale of a is :" + this.a);
	System.out.println("the value of b is : " + this.b);
	
	  
	  }
	 
	public static void main(String[] args){
		SwapAandB s = new SwapAandB();
		s.Swap();
		
	}
}