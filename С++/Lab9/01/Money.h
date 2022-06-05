//
// Created by Yan on 04.06.2022.
//

#ifndef CLIONPROJECTS_MONEY_H
#define CLIONPROJECTS_MONEY_H

#include <iostream>

class Money
{
    long dollars;
    int cents;
public:
    Money();
    Money(long , int );
    ~Money();
    int operator>(const Money&);
    friend std::ostream& operator <<(std::ostream& , Money&);
};

#endif //CLIONPROJECTS_MONEY_H
