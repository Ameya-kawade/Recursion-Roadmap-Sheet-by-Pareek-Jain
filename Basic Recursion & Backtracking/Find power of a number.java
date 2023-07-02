import java.util.* ;
import java.io.*; 

class Solution {

	public static long Pow(int X, int N) {
		//Write your code here
		if(N == 0){
			return 1;
		}
        if(X == 0){
            return 0;
        }
		return X*Pow(X,N-1);
	}
}
