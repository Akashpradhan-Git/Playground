#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
   int a,b;
  cin>>a>>b;
   cout<<"Before swapping a= "<<a<<" and b="<<b<<endl;
  swap(a,b);
  cout<<"After swapping a= "<<a<<" and b="<<b;
 
    return 0;
}
int swap(int &a,int &b)
{
  int temp;
  temp=a;
  a=b;
  b=temp;
}