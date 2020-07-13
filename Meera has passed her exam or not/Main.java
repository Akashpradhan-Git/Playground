#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
    //cout<<" ";
  }
  int reg;
  cin>>reg;
  int flag=0;
  for(int i=0;i<n;i++)
  {
    if(arr[i]==reg)
    {
      flag=1;
    }
  }
  if(flag==1)
  {
    cout<<"She passed her exam";
  }
  else
    cout<<"She failed";
}