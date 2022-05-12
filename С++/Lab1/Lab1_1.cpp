/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/
#include <iostream>

using namespace std;

   
    int main(void)
{
    int i, k;
    int power(int, int);
    for (i = 0; i < 10; i++)
    {
        k = power(2, i);
        cout << "i = " << i << ", k = " << k << endl;
    }
}
int power(int x, int n)
{
    int i, p = 1;
    for (i = 1; i < n; i++) p *= x;
    return p;
}
