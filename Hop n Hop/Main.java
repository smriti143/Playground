#include<iostream>
using namespace std;
int main()
{
  //Type your code here.  
  int x,y,h,d;
  int w=3,z=4;
  std::cin>>x>>y;
  h=x-w;
  d=y-z;
  
  h>d?std::cout<<h:std::cout<<d;
 
}