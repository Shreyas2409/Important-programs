def knapsack(v,w,c):
    n=len(v)-1
    m=[[-1]*(capacity + 1) for _ in range(n + 1)] #did not understand this line#
    return knapsack_h(v,w,m,n,c)
def knapsack_h(v,w,m,a,c):
     if m[a][w] >= 0:
            return m[a][w]
 
     if a == 0:
        q = 0
     elif weight[a] <= w:
        q = max(knapsack_h(value, weight,
                                m, a - 1 , w - weight[a])
                + value[a],
                knapsack_h(value, weight,
                                m, a- 1 , w))
     else:
        q = knapsack_h(value, weight,
                            m, a - 1 , w)
     m[a][w] = q
     return q
 
 
n = int(input('Enter number of items: '))
value = input('Enter the values of the {} item(s) in order: '
              .format(n)).split()
value = [int(v) for v in value]
value.insert(0, None) # so that the value of the ith item is at value[i]
weight = input('Enter the positive weights of the {} item(s) in order: '
               .format(n)).split()
weight = [int(w) for w in weight]
weight.insert(0, None) # so that the weight of the ith item is at weight[i]
capacity = int(input('Enter maximum weight: '))
 
ans = knapsack(value, weight, capacity)
print("The maximum value of items that can be",ans)

