#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
   int x,y;
  int ch;
  cin>>x;
  cin>>y;
  cin>>ch;
  cout<<"Enter first number : Enter second number : Menu\n";
  cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  switch(ch)
  {
    case 1: 
      int sum;
      sum=x+y;
      cout<<sum;
      break;
    case 2: 
      int sub;
      sub=x-y;
      cout<<sub;
      break;
    case 3:
      int mul;
      mul=x*y;
      cout<<mul;
      break;
    case 4:
      int div;
      div=x/y;
      cout<<div;
      break;
    case 5:
      int rem;
      rem=x%y;
      cout<<rem;
      break;
    default: cout<<"Invalid operation";
  }
    return 0;
}