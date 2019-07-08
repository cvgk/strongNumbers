
package ocp;


public class StrongNumbers {
    
    public static void main(String[] args)
    {
        for(int i=100;i<1000;i++)
        {
            int total = 0;
            String s = String.valueOf(i);
            for(int j=0;j<s.length();j++)
            {
                int k = Integer.parseInt(s.substring(j, j+1));
                total+=factorial(k);
            }
            if(total==i)
                System.out.println(i);
        }
    }
    static int factorial(int n)
    {
        if(n==0)
            return 1;
        else
            return factorial(n-1)*n;
    }
}
