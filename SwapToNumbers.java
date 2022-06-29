Class SwapToNumbers{
	int i = 10;
	int j = 20;
	int temp;
	int swap(){
		temp = this.a;
		temp = this.b;
		this.a = this.b;
		this.b = this.temp;
		System.out.println("the value of a is :" + this.a);
		System.out.println("the value of a is :" + this.b);
	}
	
}
class TestSwapToNumbers{
		public static void main(String[] Args){
			SwapToNumbers stn = new SwapToNumbers();
			stn.swap();
		}
}