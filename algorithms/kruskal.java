import java.util.Scanner;

public class kruskal {
 static int [] parent= new int[50];
 static int [][] cost=new int [10][10];
 static int a,b,i,j,u,v,n,min,noe=1,mincost=0;

 static  int find(int w)
 {
     while (parent[w]!=0) {
         w=parent[w];   
     }
        return w;
 }
 static void union()
 {
     if (u!=v) {
         noe++;
         System.out.println(noe-1+"edge("+a+","+b+")="+min);
         mincost+=min;
         parent[v]=u;
         
     }
     cost[a][b]=cost[a][b]=9999;
 }
 public static void main(String []args)
 {
        Scanner k = new Scanner(System.in);
        System.out.println("vertices");
        n=k.nextInt();
        System.out.println("matrix");
        for (i = 1; i < n; i++)
            for (j = 1; j < n; j++)
                cost[i][j] = k.nextInt();
        while (noe<n) {
            min=9999;
            for (i=1;i<n;i++) {
                 for (i=1;i<n;i++)
                 {
                     if (cost[i][j]<min) {
                         min=cost[i][j];
                         a=u=i;
                         b=v=j;
                         
                     }
                 }
                
            }
            u=find(u);
            v=find(v);
            union();

            
        }  
        System.out.println(mincost); 
        k.close();     

 }
    
}