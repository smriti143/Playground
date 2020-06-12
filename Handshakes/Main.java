#include<iostream>
using namespace std;
  //Type your code here.
int maxHandshake(int n)  

{  
return (n * (n - 1))/ 2;  

}  

int main()  

{  

int n;

cin>>n;  

cout << maxHandshake(n);  
}