#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,n=0;
  float score;
  do{
    cin>>a;
    if(a%2!=0&&a>0)
    {
      score+=1;
       n=n+1;
    }
    else if(a%2==0 && a>0)
    {
      score=score-0.5;
    }
    else if(a<0)
    {
      score= score-1;
      break;
    }
  }while(n<3);
  cout<<score;
}