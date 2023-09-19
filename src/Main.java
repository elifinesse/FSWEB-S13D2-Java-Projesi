public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome((123454321)));
        System.out.println(isPalindrome((11212)));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
    public static boolean isPalindrome(int num){
        char[] numArr = String.valueOf(num).toCharArray();
        int flag = 0;
        for(int i = 0; i < numArr.length / 2; i++){
            if(numArr[i] == numArr[numArr.length - i - 1]){
                flag++;
            }
        }
        return (flag == numArr.length / 2);
    }
    public static boolean isPerfectNumber(int num){
        int sum = 0;
        if(num < 0){
            return false;
        } else{
            for(int i = 1; i <= num / 2; i++){
                if(num % i == 0){
                    sum += i;
             }
            } return sum == num;
        }
    }
    public static String numberToWords(int num){
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        char[] numArr = String.valueOf(num).toCharArray();
    }
}