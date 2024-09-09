// Java program to add two binary strings

public class GFG {

	// Function to add two binary strings
	static String add_Binary(String x, String y)
	{

		int num1 = Integer.parseInt(x, 2);
		// converting binary string into integer(decimal
		// number)

		int num2 = Integer.parseInt(y, 2);
		// converting binary string into integer(decimal
		// number)

		int sum = num1 + num2;
		// Adding those two decimal numbers and storing in
		// sum

		String result = Integer.toBinaryString(sum);
		// Converting that resultant decimal into binary
		// string

		return result;
	}
#feature 2.2 chages done by vivek in nov 2023
class ComplexNumber {
 
    // variables to hold real and imaginary part of complex
    // number
    int real, image;
 
    // Constructor which will be used while creating complex
    // number
    public ComplexNumber(int r, int i)
    {
        this.real = r;
        this.image = i;
    }
 
    // function to print real number
    public void showC()
    {
        System.out.println(this.real + " +i " + this.image);
    }
 
    // we will implement  this function for addition
    public complex add(ComplexNumber, ComplexNumber);
}
#end of feature 2.2 changes done by vivek in 2023
	// Main driver method
	public static void main(String args[])
	{
		String x = "011011", y = "1010111";

		System.out.print(add_Binary(x, y));
	}
}
