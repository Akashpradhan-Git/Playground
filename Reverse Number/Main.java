#include <iostream>
int main() 
{
	// Type your code here
  int n;
  int rev;
  std::cin>>n;
  while(n!=0)
  {
    rev=n%10;
    n=n/10;
    std::cout<<rev;
  }
  
	return 0;
}