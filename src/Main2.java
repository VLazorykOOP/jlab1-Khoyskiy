import java.util.Scanner;
public class Main2 {
    static Scanner in;
    static int[][] Input(){
        System.out.print("Input the rows and columns for the Array A(<20 and row=columns): ");
        int n = in.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            A[i] = new int[n];
            for (int j = 0; j < n; j++) {
                A[i][j] = in.nextInt();
            }
        }
        return A;
    }
    static void Print(int[][] A)
    {
        for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + "  ");
			}
			System.out.println();
		}
    }
    static int Numbers(int[][] A)
    {
        int l=0;
        int k=0;
            for(int i=0;i<A.length;i++){
                for (int j =0;j<A[i].length/2;j++){
                    if(A[i][j]==A[i][A.length-j-1]){
                        k++; 
                        if(k == A.length/2){
                            System.out.println("Number of row " + (i+1));l++; 
                        }                 
                    }
                    else break;
                }
                k=0;
            }
        return l;
    }
	
    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Lab 1 Java");
        int[][]A = Input();
        Print(A);
        int l = Numbers(A);
        System.out.print(l);  
    }
}
    

