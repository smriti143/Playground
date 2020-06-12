#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,f,l,sum;
  std::cin>>n;
  f=n;
  l= n % 10;
  f=f/1000;
  sum=f+l;
  std::cout<<sum;
}