import java.io.*;
import java.util.*;
class DynamicInput{
	int a,b;
	void Product(){
		System.out.println("the Product of a & b is :" +(a*b));
	}
	
}
class TestDynamicInput{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DynamicInput di = new DynamicInput();
		di.a = sc.nextInt();
		di.b = sc.nextInt();
		di.Product();
	}
}