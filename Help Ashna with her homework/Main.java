#include<iostream>
int main()
{
  int a,b;
  std::cin>>a>>b;
  int sum=a+b;
  int sub=a-b;
  int mul=a*b;
  int div=a/b;
  int rem=a%b;
  std::cout<<"a+b="<<sum<<"\n"<<"a-b="<<sub<<"\n"<<"a*b="<<mul<<"\n"<<"a/b="<<div<<"\n"<<"a%b="<<rem;
}