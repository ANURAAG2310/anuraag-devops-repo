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
#feature2.1 making some changes by the developer vivek for the HDFC project in nov 2023
 public static String addBinary(String x, String y)
    {
        int i = x.length() - 1, j = y.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += x.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += y.charAt(j) - '0';
            }
            if (sum == 0 || sum == 1) {
                result.append(sum);
                carry = 0;
            }
            else if (sum == 2) {
                result.append("0");
                carry = 1;
            }
#feature2.1 end of code by vivek
	// Main driver method
	public static void main(String args[])
	{
		String x = "011011", y = "1010111";

		System.out.print(add_Binary(x, y));
	}
}
