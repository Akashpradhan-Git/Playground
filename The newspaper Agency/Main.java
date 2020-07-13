#include<iostream>
using namespace std;
int main()
{
  int w,x,y;
  cin>>w;
  cin>>x;
  cin>>y;
  
  int pro,sell,cost;
  sell=w*x;
  cost=w*y+100;
  pro=sell-cost;
  cout<<pro;
}