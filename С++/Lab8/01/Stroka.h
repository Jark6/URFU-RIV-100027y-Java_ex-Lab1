#ifndef STROKA_H_
#define STROKA_H_
#include <iostream>	


class Stroka{
	
	public:
		Stroka();
		Stroka(char*);
		Stroka(const Stroka&);
		Stroka& operator=(const Stroka&);
		Stroka& operator=(const char* s);
		Stroka& operator+(const Stroka&);
		int operator == (const Stroka&);
		int dlina();
		void vvod();
		void vyvod();
		~Stroka();
		
		friend std::istream& operator>>(std::istream&, Stroka&);
    	friend std::ostream& operator<<(std::ostream&, const Stroka&);
	private:
		char *str;
};



#endif /* STROKA_H_ */