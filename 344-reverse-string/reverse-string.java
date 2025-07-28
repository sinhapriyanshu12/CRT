class Solution {
    public void reverseString(char[] s){

        //take 2 pointers left and right and start 1 from 0 other from n-1
        int left=0; int right= s.length-1;

        //now see if left<right and then work accordingly
        while(left<right){

            //make a temp variable to store the chr values so you can easily change them
            //Also in this code we are comparing the index values to know if left is < right or not.
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            //once it is dont move left pointer forward and right pointer backward
            left++;
            right--;
        }
    }
}
