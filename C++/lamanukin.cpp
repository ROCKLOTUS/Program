/*************************************************************************
	> File Name: lamanukin.cpp
	> Author: 
	> Mail: 
	> Created Time: 2016年06月16日 星期四 11时18分14秒
 ************************************************************************/

#include <iostream>
#include <cmath>
 
 using namespace std;
  
  double execute(int d, double result){
          if(d <= 1)
              return sqrt(result);
      else{
                  double temp = 1 + d * sqrt(result);
                  return execute(d - 1, temp);
              
      }

  }
   
   int main(){
           const int SIZE = 10;
        
           cout << "execute(10,10)" << " is " << execute(10,10) << endl;
        
           return 0;

   }
    
