import java.util.Scanner;
import java.util.Arrays;
public class Main1 {
    static Scanner in;
    static int[] Input(){
        System.out.println("Input the length of the array A(<500): ");
        int n = in.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++){
        System.out.print("A["+i+"] = ");
        A[i]=in.nextInt();
    }
        return A;
    }
    static void Print(int[] A, int n)
    {
        for (int i = 0; i < n; i++){
        System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    
    public static int Change(int A[],int n){
       if (n == 0 || n == 1) {
        return n;
    }
    int k = 0 ;
    int l = 0;
    for (int i = 0; i < n-1; i++) {
            k++;    
            if(i+1==n-1 && k>=3 && A[i]==A[i+1]) {
                l=l-k+1;
                k=0;
                break;
            } 
            if(k>=4 && A[i]!=A[i+1]){
                l=l-k+1;
                k=0;
                continue;
            } 
            if(A[i]!=A[i+1]){
                A[l++] = A[i];
                k=0;
                if(i+1==n-1){A[l++]=A[i+1];break;}
                continue;
            }
            else A[l++] = A[i];  
         }
    return l;
}
 
public static void main(String[] args) {
        System.out.println("Lab 1 Java");
        in = new Scanner(System.in);
        int[] A=Input();
        Arrays.sort(A);
        System.out.println("Array:");
        int n = A.length;
        int l=0;
        l = Change(A, n);
        Print(A,l);

}
}