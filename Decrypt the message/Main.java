#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int x,y,add=0;
  cin>>x;
  cin>>y;
  int sum=x+y;
  for(int i=1;i<sum;i++)
  {
   	if(sum%i==0)
    {
      add=add+i;
    }
  }
  //cout<<add;
  if(add==sum)
  {
    cout<<"They can read the message";
  }
  else
    cout<<"They can't read the message";
    return 0;
}