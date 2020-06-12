#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  std::cin>>x>>y>>z;
  if(y>=2 && z<=3)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";
  }
}