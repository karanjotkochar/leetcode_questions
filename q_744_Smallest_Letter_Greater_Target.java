//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class q_744_Smallest_Letter_Greater_Target {
    public static void main(String[] args) {
       char[] letters = {'c', 'f', 'j'};
       char target = 'a';

       nextGreatestLetter(letters, target);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end= letters.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(letters[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return letters[start % letters.length];

    }
}
