
package week3.day1;

public class Calculator {
	
	public int add(int num1,int num2) {
		
		return num1+num2;
		
	}
public int add(int num1,int num2, int num3) {
		
		return num1+num2+num3;
		
	}
public int sub(int num1,int num2) {
	
	return num1-num2;
	
}
public double sub(double num1,double num2) {
	
	return num1-num2;
	
}
public int mul(int num1,int num2) {
	
	return num1*num2;
	
}
public double mul(int num1,double num2) {
	return num1*num2;
}
	public static void main(String[] args) {
	Calculator cal = new Calculator();
System.out.println(	cal.add(5, 2));
System.out.println(cal.add(5, 2, 5));
System.out.println(cal.sub(6, 3));
System.out.println(cal.sub(10000, 5000));
System.out.println(cal.mul(5, 3));
System.out.println(cal.mul(5, 1246565));
	}

}
