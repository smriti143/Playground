#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
    int x;
  std::cin>>x;
    if(x<=200)
    std::cout<<"Rs."<<(int)(0.5*x);
  else if(x<=400)
    std::cout<<"Rs."<<(.65*x)+100;
    else if(x<=600)
    std::cout<<"Rs."<<(.80*x)+200;
    else 
    std::cout<<"Rs."<<(1.25*x)+425;
}