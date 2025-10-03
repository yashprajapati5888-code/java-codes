package practiceq.stringtwo;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = true;

        int n = str.length();
        for(int i =0; i<n/2; i++ ){
            if(str.charAt(i) != str.charAt(n-1-i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome)
        System.out.println(str+ "is Palindrome");
        else
            System.out.println(str+ "is not Palindrome");
    }
}
