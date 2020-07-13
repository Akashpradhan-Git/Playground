#include<iostream>
int fibo(int n);
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<fibo(n);
}
int fibo(int n)
{
  if(n==1)
    return 0;
  if(n==2)
    return 1;
  return fibo(n-1)+fibo(n-2);
  
  
}