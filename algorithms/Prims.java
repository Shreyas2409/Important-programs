import java.util.Scanner;

public class Prims {

    

     public static void main(String[] args) {
        
    
    int n,i,j;
    int [][]cost=new int [10][10];
    Scanner c= new Scanner(System.in);
    System.out.println("no of vertices");
    n=c.nextInt();
    System.out.println("matrix");
    for(i=1;i<n;i++)
     for(j=1;j<n;j++)
         cost[i][j]=c.nextInt();
    prims(cost,n);
    c.close();


    }
    static void prims(int cost[][],int n)
    {
        int []v=new int[10];
        int min,p,q,i,j,flag=0,mincost=0,noe = 0;
        for (i = 1; i < n; i++)
            v[i] = 0;
        v[i] = 1;
        while (noe != n) {
            min = 9999;
            i = j = -1;
            flag = 0;
            for (p = 1; p <= n; p++)
                for (q = 1; q <= n; q++) {
                    if (p == q)
                        continue;
                    if ((cost[p][q] < min) && (v[p] == 1) && (v[q] != 1)) {
                        min = cost[p][q];
                        i = p;
                        j = q;
                        flag = 1;

                    }
                }
            if (flag == 0) {
                System.exit(0);
            }
            if (i != -1) {
                v[j] = 1;
                System.out.println("(" + i + "," + j + ")=" + cost[i][j]);
                noe++;
                mincost+=cost[i][j];
              }

             
             
            
        } 




    }
}