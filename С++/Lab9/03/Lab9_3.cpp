
#include "Lab9_3.h"
#include <iostream>
#include <string.h>

using namespace std;

template <class T>
class Tstack
{
protected:
    int numItem;
    T *item;
public:
    Tstack(size_t size = 10)
    {
        numItem = 0;
        item = new T[size];
    }
    ~Tstack()
    {
        delete[] item;
    }
    void push(T t);
    T pop();
        bool isEmpty() {
        return (numItem<=0);
    }
};
template <class T>
void Tstack <T>::push(T t)
{
    item[numItem++] = t;
}
template <class T>
T Tstack <T>::pop()
{
    return item[--numItem];
}

using namespace std;

void printArr(int a[], int SIZE) {
    cout << " - ";
        for(int i=0; i<SIZE; i++) {
        cout << a[i] << " - ";
    }

    cout << endl;
}


void  sortStack (const int a[], int SIZE){
    int max, buff = 0;
    int s = SIZE;
    int arr[s];
    Tstack <int> st_left(s);
    Tstack <int> st_right(s);
    Tstack <int> st_bottom(s);
    for(int i=0; i < s; i++){
        st_left.push(*(a+i));
    }
    while(!(st_left.isEmpty() && st_right.isEmpty())){
        while(!st_left.isEmpty()){
            buff = st_left.pop();
            if(buff>max) max=buff;
            st_right.push(buff);
        }
        while(!st_right.isEmpty()){
            buff = st_right.pop();
            if(buff==max) st_bottom.push(buff);
            else st_left.push(buff);
        }
        max=0;
    }
    int i = 0;
    while(!st_bottom.isEmpty()){
        arr[i]=st_bottom.pop();
        i++;
    }
    printArr(arr,s);
}
int main(void) {

    int n1[] = {3,5,1};
    int n2[] = {1,10,6, 8,3};
    int s1 = sizeof(n1)/sizeof(int);
    int s2 = sizeof(n2)/sizeof(int);
    cout << "=== Train unsorted ===" << endl;
    printArr(n1,s1);
    printArr(n2,s2);
    cout << "=== Train sorted ===" << endl;
    sortStack(n1,s1);
    sortStack(n2,s2);
    return 0;
}