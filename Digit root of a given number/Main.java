#include<stdio.h>
//#include<conio.h>
void main()
{
int n,sum=10,n1;
scanf("%d",&n);
while(sum>=10)
{
sum=0;
while(n!=0)
{
n1=n%10;
sum=sum+n1;
n=n/10;
}
n=sum;
}
printf("%d ",sum);
}
