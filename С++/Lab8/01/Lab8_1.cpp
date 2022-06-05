#include <iostream>
#include <cstdio>
#include "Stroka.h"

using namespace std;

int main(){
	setlocale(LC_ALL, "ru");		
	Stroka s1((char*)"qwert"), s3, s4(s1), s5;
	string x;
	cout<<"s1 "<<s1<<endl;
	cout<<"s3 "<<s3<<endl;
	cout<<"s4 "<<s4<<endl;
	cout<<"s5 "<<s5<<endl;
	//s3.vvod();
	s3="asdfg";
	cout<<"s3 "<<s3<<endl;
	cout<<"Enter S3"<<endl;
	cin>>s3;
	//s3.vyvod();
	cout<<"s3 "<<s3<<endl;
	//s5=s1+s3+s4;
	cout<<"length s3 = "<<s3.dlina()<<endl;
	//s5.vyvod();
	//cout<<"s5 "<<s5<<endl;
	/*if(s1==s5)
		cout<<"strings s1 & s5 equal"<<endl;
	else
		if(s1==s4)
			cout<<"strings s1 & s4 equal"<<endl;*/
	return 0;
}