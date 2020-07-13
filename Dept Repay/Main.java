#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int amount,ri,year;
  cin>>amount;
  cin>>ri;
  cin>>year;
  
  int i=(amount*year*ri)/100;
	int total=amount+i;
  float dis=(float)i*2/100;
  
float set=total-dis;
  
  cout<<i<<endl;
  cout<<total<<endl;
  cout<<dis<<endl;
  cout<<set<<endl;
}