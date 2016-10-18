import java.util.Scanner;

public class Pali {

	
    public static boolean isPalindrome(int x) {
        
    int  number;   
	int temp = x;
	int reverse = 0;
	
	
    while(x > 0){
	number = x % 10;
    reverse  = reverse * 10 + number;
     x = x/10;
     
    
    }
	
	if(temp == reverse || temp ==0){
		System.out.println("it's a palidrome");
	return true;
	}
	else
	
	
	System.out.println("Nah, try again");
	return false;
    }
	


 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter some number to test if palindrome");
		
		int keys = keyboard.nextInt();
		
		isPalindrome(keys);
		
	}

	}		