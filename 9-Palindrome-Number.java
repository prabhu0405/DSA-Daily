/*Given an integer x, return true if x is a palindrome, 
and false otherwise. */

class Solution {
    public boolean isPalindrome(int x) {
        int check = x;
        int z = 0;
        
        if(x<0){
            return false;
        }
        while(check > 0){
            z = 10*z + check%10;
            check = check/10;
        }
        return (z == x) ? true : false;
        }
    }
