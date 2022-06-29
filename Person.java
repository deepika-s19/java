import java.io.*;
class person{
	// instance variables
	int height, weight;
	static int collegecode;
	//constructor: used to intilaize the value of the varaibles
	person(int h, int w){
		this.height=h;
		this.weight=w;
	}
		void run(){
			System.out.println("programming statred running.............j");
		}
			void print(){
				System.out.println("Now my weight is ;" + this.weight);
				System.out.println("Now my height is ;" + this.height);
			}
				void staticPrint(){
					collegecode = 10118;
					System.out.println("the college code is ; " + collegecode);
				}
					public static void main(String[] args){
						//creating an object
						person deepika = new person (6,70);
						person xyz = new person (8,120);
						deepika.run();
						deepika.print();
						xyz.run();
						xyz.print();
						deepika.staticPrint();
						xyz.staticPrint();
					
				
				
			
		
	}
}
