#include<iostream>
using namespace std;
int fact(int);
int main(){
  // Type your code here
  int n;
  cin>>n;
  int res=1;
  for(int i=2;i<=n;i++)
  {
    res*=i;
  }
  cout<<res;
  
  return 0;
}
