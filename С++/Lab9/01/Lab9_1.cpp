#include <iostream>
#include <locale.h>
#include "Money.h"

using namespace std;

template <class T>
void Sort(T array[], size_t size)
{
    int i, j;
    T tmp;
    for (i = 0; i < size; i++) {
        for (j = 0; j < size; j++) {
            if (array[j] > array[i]) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
    }
}


int main(void)
{
    Money mas[]={	Money(19,10),
                   Money(99,99),
                   Money(99,95),
                   Money(19,95)
    };

Sort(mas, sizeof(mas)/sizeof(mas[0]));
for(int i = 0; i < sizeof(mas)/sizeof(mas[0]); i++)
cout << "mas[" << i << "] =  "<< mas[i] << endl;
}

/*
int main(void)void
{
    int i;
    int mas[] = {10, 20, 30, 11, 25, 32, 0};
    Sort(mas, sizeof(mas)/sizeof(mas[0]));
    for(i = 0; i < sizeof(mas)/sizeof(mas[0]); i++)
        cout << "mas[" << i << "] = " << mas[i] << endl;
    return 0;
}
*/
