#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float x;
  int y,z;
  std::cin>>x>>y>>z;
  int res=x*y;
 if(res>=z)
   std::cout<<"Can reach";
else
std::cout<<"Cannot reach";
}