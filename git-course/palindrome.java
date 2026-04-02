class ispalindrome{
     public static boolean isPalindrome(int num) {
        if (num < 0) return false; // Negative numbers are not palindromes
        int original = num, reversed = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
}

public class palindrome{
    public static void main(String args[]){
        ispalindrome obj=new ispalindrome();
          boolean a= obj.isPalindrome(565);
          System.out.println(a);
    }
 }
