#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y;
  std::cin>>x>>y;
  if(y==2*x)
    std::cout<<"circle can be inside a square";
  else
    std::cout<<"circle cannot be inside a square";
}