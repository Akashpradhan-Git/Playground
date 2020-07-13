#include<iostream>
#include<math.h>
int main()
{
	int n;
	std::cin>>n;
	
	int temp=n;
	int c=0;
	while(temp!=0)
	{
		c++;
		temp=temp/10;	
	}
	temp=n;
	int sum=0;
	while(temp!=0)
	{
		int r=temp%10;
		sum=sum+pow(r,c);
		temp=temp/10;
	}
	if(sum==n)
	{
		std::cout<<"Kindly proceed with encrypting";
	}
	else
	std::cout<<"It is not an Armstrong number";

}