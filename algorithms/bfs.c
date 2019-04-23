int main()
{
    int n,m,i,a,b;
    int adjlist[100][100]={0};
    int degree[101]={0};
    scanf(" %d %d",&n,&m);
    i=0;
    while(i<m)
    {
        scanf(" %d %d",&a,&b);
        adjlist[a][degree[a]]=b;
        degree[a]++;
        adjlist[b][degree[b]]=a;
        degree[b]++;
        i++;
    }
    int queue[101],front=0,rear=0;
    int done[101]={0};
    int at;
    queue[rear]=1;
    rear++;
    done[1]=1;
    while(front!=rear)
    {
        at=queue[front];
        printf("At node %d\n",at);
        front++;
        for(i=0;i<degree[at];i++)
        {
            if(done[adjlist[at][i]]!=1)
            {
                queue[rear]=adjlist[at][i];
                rear++;
                done[adjlist[at][i]]=1;
            }
        }
    }
    return 0;
}