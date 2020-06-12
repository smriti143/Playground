#include<iostream>
int main(){
  // Type your code here
  int x,y=1;
  std::cin>>x;
  for(int i=1;i<=x;i++)
  {
    y=y*i;
  }
  std::cout<<y;
}