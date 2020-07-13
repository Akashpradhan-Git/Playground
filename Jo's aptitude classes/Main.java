#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int a,b,c,d;
  cin>>a>>b>>c>>d;
  int small=0;
  int gcd=0;
  if(a<b && a<c)
  {
    small=a;
  }
  else if(b<a && b<c)
    small=b;
  else
    small=c;
  while(small>=1)
  {
    if(a%small==0 && b%small==0 && c%small==0)
    {
      gcd=small;
      break;
    }
    small--;
  }
  //cout<<gcd<<" ";
  if(gcd==d)
  {
   cout<<"Answer is correct."; 
  }
  else
    cout<<"Answer is wrong.";
    return 0;
}