/*
 * ����ֻ�� "I"�����󣩻� "D"����С�����ַ��� S ���� N = S.length��
���� [0, 1, ..., N] ���������� A ʹ�ö������� i = 0, ..., N-1�����У�
��� S[i] == "I"����ô A[i] < A[i+1]
��� S[i] == "D"����ô A[i] > A[i+1]
 
ʾ�� 1��
�����"IDID"
�����[0,4,1,3,2]

ʾ�� 2��
�����"III"
�����[0,1,2,3]

ʾ�� 3��
�����"DDI"
�����[3,2,0,1]
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
