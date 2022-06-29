class Boolean{
	public static void main(String [] args){
		boolean firstDecesion =  true;
		boolean secondDecesion =  false;
		System.out.println(firstDecesion && secondDecesion); //false 1*0 = 0
		System.out.println(firstDecesion && firstDecesion); //true 1*1 = 1
		System.out.println(secondDecesion && firstDecesion); //false 0*1 = 0
		System.out.println(secondDecesion && secondDecesion); //false 0*0 = 0
		
		System.out.println(firstDecesion || secondDecesion); // true 1+0 = 1
		System.out.println(firstDecesion || firstDecesion); //true 1+1 = 2
		System.out.println(secondDecesion || firstDecesion); //true 0+1 = 1
		System.out.println(secondDecesion || secondDecesion); //false 0+0 = 0
		
		System.out.println(firstDecesion ^ secondDecesion); //true bcz both the values are different
		System.out.println(firstDecesion ^ firstDecesion); //false bcz both the values are same
		System.out.println(secondDecesion ^ firstDecesion); //true bcz both the values are different
		System.out.println(secondDecesion ^ secondDecesion); //false bcz both the values are same
		
		
		
	}
}