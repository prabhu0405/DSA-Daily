/*Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit 
integer range [-231, 231 - 1], then return 0.*/

class Solution {
    public int reverse(int x) {
        int z = Math.abs(x);
        int r = 0;
        while(z != 0){
            int y = z%10;
            if (r > (Integer.MAX_VALUE - y) / 10) {
                return 0;
            }
            r = r*10 + (y);
            z = z/10;
        }
        return (x<0) ? (-r) : r;
    }
}