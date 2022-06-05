#include <iostream>
#include <fstream>
#include <stdlib.h>
#include <ctype.h>

using namespace std;

int main()
{
		ifstream is;
	is.open("123.txt");
	if (is) {		
		while (! is.fail() || !is.bad()) {               
			char a = is.get();                            
			if (a == '\n') {                           
				is.clear(is.rdstate() | ios::eofbit); 
				cout << "\nEnd of string";
			}
			if (is.eof()) {
				cout << "\nEnd of File received";
				break;
			}
			cout << a;
		}
		if(is.bad()||is.fail()){
			cout << "\nBadbit received";
		}
	}

	return 0;
}