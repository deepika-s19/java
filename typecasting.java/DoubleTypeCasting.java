class DoubleTypeCasting{
 public static void main(String[] args){
 float num1 = 10;
 byte result = (byte)(short)(int)(long)(float) num1;
   System.out.println("The converted data is" + result);
   
   // WAP to type cast a double data type variable into float-->long--> int--> short--> byte than store into a byte data type variable.

 }
}