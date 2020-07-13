#include<iostream>
int fact(int n);
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  std::cout<<"The factorial of "<<n<<" is "<<fact(n);
}
int fact(int n)
{
  if(n>1)
    return n*fact(n-1);
}