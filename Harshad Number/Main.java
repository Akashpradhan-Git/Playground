#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num;
  cin>>num;
  int n=num;
  int sum=0;
  while(n>0)
  {
    int r=n%10;
    sum=sum+r;
    n=n/10;
  }
  //cout<<sum;
  if(num%sum==0)
  {
    cout<<"Harshad Number";
  }
  else
  {
    cout<<"Not Harshad Number";
  }
}