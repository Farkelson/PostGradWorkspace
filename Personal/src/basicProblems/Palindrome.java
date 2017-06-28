package basicProblems;

public class Palindrome {
    public static boolean isPalindrome(String word) {
    	if(word.length() <=1){
    		return true;
    	}
    	String lowerWord = word.toLowerCase();
    	if(lowerWord.charAt(0) == lowerWord.charAt(lowerWord.length()-1)){
    		return isPalindrome(lowerWord.substring(1, lowerWord.length()-1));
    	}
    	return false;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}