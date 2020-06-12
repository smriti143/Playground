#include<iostream>
using namespace std;
int main()
{
  int x,y,w,z,a;
float d,t;
  std::cin>>x>>y>>w;
  z=x*y*w/100;
  a=x+z;
  d= z*.02;
 
  t=a-d;
  std::cout<<z<<"\n"<<a<<"\n"<<d<<"\n"<<t;
}