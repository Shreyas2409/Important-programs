int adjmat[100][100]={0};
int degree[100]={0};
int finish[100]={0};
void dfs(int a)
{
    if(finish[a]==1)
        return;
    printf("At node %d\n",a);
    finish[a]=1;
    int i=0;
    while(i<degree[a])
    {
        dfs(adjmat[a][i]);
        i++;
    }
    return;
}
int main()
{
    int n,m,i,at,b;
    scanf(" %d %d",&n,&m);
    i=0;
    while(i<m)
    {
        scanf(" %d %d",&at,&b);
        adjmat[at][degree[at]]=b;
        degree[at]++;
        adjmat[b][degree[b]]=at;
        degree[b]++;
        i++;
    }
    dfs(1);
    return 0;
}