/*
 * 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
如果 S[i] == "I"，那么 A[i] < A[i+1]
如果 S[i] == "D"，那么 A[i] > A[i+1]
 
示例 1：
输出："IDID"
输出：[0,4,1,3,2]

示例 2：
输出："III"
输出：[0,1,2,3]

示例 3：
输出："DDI"
输出：[3,2,0,1]
*/
package lianxi0307;

public class test0307 {
	public static void main(String[] args) {
		Solution S = new Solution();
		String s = "IDIDD";
		int[] a = S.diStringMatch(s);
		for(int i = 0;i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}

class Solution {
    public int[] diStringMatch(String S) {
        int[] A=new int[S.length()+1];
        int a=0;
        int b=S.length();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='I'){
                A[i]=a++;
                if(i==S.length()-1){
                    A[i+1]=a++;
                }
            }
            if(S.charAt(i)=='D'){
                A[i]=b--;
                if(i==S.length()-1){
                    A[i+1]=b--;
                } 
            }
        }
        return A;
    }
}
