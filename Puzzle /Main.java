#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r,c;
  cin>>r>>c;
  
int arr[10][10];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>arr[i][j];
    }
  }
  
  for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
    {
      	cout<<arr[j][i]<<" ";
    }
    cout<<"\n";
  }
  
}