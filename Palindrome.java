public class Palindrome {
    public static void main(String [] args){        Palindrome pn = new Palindrome();
        if(pn.isPalindrome("ABBA")){
            System.out.println("Qazaq");        } else {
            System.out.println("Qazan");        }
    }
    public boolean isPalindrome(String original){        int i = original.length()-1;
        int j=0;        while(i > j) {
            if(original.charAt(i) != original.charAt(j)) {                return false;
            }            i--;
            j++;        }
        return true;    }
}