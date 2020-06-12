#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
char a[10];
int b;
std::cin>>a;

std::cin>>b;

if((strcmp(a,"rear")==0))

{
if(b==1)
{
std::cout<<"Right Handed";
}
else
{
std::cout<<"Left Handed";
}
}
else if((strcmp(a,"front")==0 ))
{
if(b==1)
std::cout<<"Left Handed";
else
{
std::cout<<"Right Handed";
}
}
return 0;
}