#include<iostream>
int main()
{
  // Type your code here
  int n,count=0;
  std::cin>>n;
  do{
    int rem=n%10;
    n=n/10;
    count++;
  }while(n>0);
    std::cout<<count;
}