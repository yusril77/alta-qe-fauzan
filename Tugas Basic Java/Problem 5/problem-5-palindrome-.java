public class palindrome {
    private static boolean palindrome(String value) {

        String temp ="";
        for(int i= value.length()-1; i>=0; i--){
            char c = value.charAt(i);
            temp += String.valueOf(c);
        }
        if (value.equals(temp)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kupu-kupu"));
    }
}
