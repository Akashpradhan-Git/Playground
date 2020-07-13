#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int nb,na,nc;
  cin>>nb;
  cin>>na;
  cin>>nc;
  int wa;
  wa=na*75;
  int wc;
  wc=nc*30;
  int sum=wa+wc;
  if(nb>sum)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
}