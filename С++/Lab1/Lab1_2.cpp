/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;
#define PR(x) printf ("x=%u, *x=%c, &x=%u\n",x,*x,&x)
#include <stdio.h>
int main(void)
{
    char mas[]={'a', 'b', 'c'};
    char *ptr1, *ptr2;
    ptr1=mas;
    ptr2=&mas[2];
    PR(ptr1);
    ptr1++;
    PR(ptr1);
    PR(ptr2);
    ++ptr2;
    printf("ptr2-ptr1=%u\n", ptr2-ptr1);
}
