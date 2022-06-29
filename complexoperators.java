class complexoperators{
	public static void main(String[] args){
		int num = 5, a = 10;
		//System.out.println(+ ++num - ++num);
		System.out.println((--a + --a) * (++a - a--) + (--a + a--) * (++a + a++));
		
		// --a  is a pre-increment like first incerment then assigment
		// a-- is a post -incerment like first assigment then incerment
		// acts as a BODamas
		//* removes bracket
		//* mutiplication
		//* add, sub
		
		
	}
}