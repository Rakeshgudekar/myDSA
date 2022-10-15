import java.util.Locale;

public class PallindromeString {
    public static void main(String[] args) {
      String s="abcd efgfe dc : ba ";
      Boolean ans= isPallindrome(s);
        System.out.println(ans);


    }
    static boolean isPallindrome(String s){
        s=s.toLowerCase();
        StringBuilder newS= new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                newS.append(s.charAt(i));
            }
        }
        int end=newS.length()-1;
        for (int i = 0; i <newS.length()/2 ; i++) {
            if(newS.charAt(i)!= newS.charAt(end-i)){
                return false;
            }

        }
 return true;
    }
}
