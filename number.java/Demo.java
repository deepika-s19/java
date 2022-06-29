Class Demoinstance{
	int i=10;
	int j=20;
	public static void main(String[] args){
		Demoinstance d = new Demoinstance();
		system.out.println("the object created has reference value of : " + d);
		for(int i=1;i<=10;i++){
	    d.i=d.i+1;
		d.j=d.j+1;
		system.out.println("the instance number"+ i + "has value of i : " + d.i + "and the value of j :" + d.j);
		}
		
	    
	}
}