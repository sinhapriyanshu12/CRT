
class Solution {
    public int reverse(int x) {
        int reverse=0;
        int lastDigit;
        while(x!=0){
             lastDigit=(x%10);
    if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && lastDigit > 7)) return 0;
    if (reverse  < Integer.MIN_VALUE / 10 || (reverse  == Integer.MIN_VALUE / 10 && lastDigit < -8)) return 0;
            reverse=(reverse*10)+lastDigit;
            x /=10;

        }

    return (int)reverse;

        
    }
}
