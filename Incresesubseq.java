package practiceproject;
import java.util.Scanner;
public class  Incresesubseq
{
    public int[] lis(int[] X)
    {        
        int n = X.length - 1;
        int[] M = new int[n + 1];  
        int[] P = new int[n + 1]; 
        int L = 0;
        for (int i = 1; i < n + 1; i++)
        {
            int j = 0;
            for (int position = L ; position >= 1; position--)
            {
                if (X[M[position]] < X[i])
                {
                    j = position;
                    break;
                }
            }            
            P[i] = M[j];
            if (j == L || X[i] < X[M[j + 1]])
            {
                M[j + 1] = i;
                L = Math.max(L,j + 1);
            }
        }
 
        int[] result = new int[L];
        int pos = M[L];
        for (int i = L - 1; i >= 0; i--)
        {
            result[i] = X[pos];
            pos = P[pos];
        }
        return result;             
    }
    public static void main(String[] args) 
    {    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = scan.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("\nEnter "+ n +" elements");
        for (int i = 1; i <= n; i++)
            arr[i] = scan.nextInt();
        Longestincrease obj = new Longestincrease(); 
        int[] result = obj.lis(arr);      
        System.out.print("\nLongest Increasing Subsequence\n ");
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] +" ");
        System.out.println();
    }
}
