interface Sample{
	void method1();
	void method2();
}
interface childSampleInterface{
	void method3();
	void method4();
	
}
interface SampleImplement extends childSampleInterface{
	public void method1(){
		System.out.println("method1");
	}
	public void method2(){
		System.out.println("method2");
	}
	public void method3(){
		System.out.println("method3");
	}
	public void method4(){
		System.out.println("method4");
	}
}
class Test{
	public static void main(String[] args){
		MySampleClass childobj = new MySampleClass();
	    childobj.method1();
	    childobj.method2();
	    childobj.method3();
	    childobj.method4();
		
    }
}

