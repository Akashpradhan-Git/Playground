#include <stdio.h>
int main()
{
   // Try out your code here
   int mn,mx,i,n,sum;
  scanf("%d",&mn);
  scanf("%d",&mx);
    for(n=mn;n<=mx;n++)
    {
      i=1;
      sum=0;
      while(i<n)
      {
        if(n%i==0)
        {
          sum=sum+i;
         
        }
         i++;
      }
      if(sum==n)
        printf("%d ",n);
    }
  printf(" ");
   return 0;
}