#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int m,n,req;
  cin>>m>>n>>req;
  int mul=1;
  
  if(m*n*req<=50)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
    cout<<"Sorry Doctor! You need more bacteria.";
    return 0;
}