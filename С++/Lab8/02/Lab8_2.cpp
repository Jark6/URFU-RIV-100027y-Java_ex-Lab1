#include <iostream>
#include <fstream>
#include <stdlib.h>
#include <ctype.h>

using namespace std;

void Ifs_Ofs_cpy1(){
	char fname[15],c;
	cout<<"Enter input file"<<endl;
	cin>>fname;
	ifstream ifs(fname); 
	if (!ifs) 
	{
		cout << "Input file not open " <<fname<<endl;
		return;
	}
	cout<<"Enter output file"<<endl;
	cin>>fname;
	
	ofstream ofs(fname);
	if (!ofs)
	{
		cout << "Output file not open " <<fname<<endl;
	}

	
	while (ifs && ofs)
	{
		ifs.get(c); 
		c = toupper(c);
		ofs.put(c); 
		cout << "Copy success " << endl;	
	}	
}

void Ifs_Ofs_cpy2(){
	char name[15];
	fstream fin;
	cout<<"Enter file name"<<endl;
	cin>>name;
	fin.open(name, ios::in);
	if (fin) 
	{
		cout << "File open " <<name<<endl;
		char test[] = {'\n', 't', '\t', 's'};
    	for(char ch : test) {
        fin.put(ch);
    	}	
	}
	else{
		cout << "File not open " <<name<<endl;
	}
}

/*void Ifs_Ofs_cpy3(){
	const char fname[] = "NewFile.txt";
		ofstream ofs(fname, os::out|ios::noreplace);
	if (!ofs) {
		cout << "Error! File "
			<< fname
			<< "does not exist "
			<< endl;
	}
	else {
		ofs << "This string is recorded in new file";
		ofs.close();
		fstream fs;
		fs.open(fname, ios::out | ios::ate);
		fs << "Added ";
		fs.close();

		fstream ifs(fname);

		if (ifs) {
			cout << "Old file contains"
				<< "... " << endl;
			char Line[80];
			ifs.getline(Line, sizeof(Line));
			cout << Line;
		}
		else {
			cout << "Error "
				<< "when opened "
				<< fname
				<< endl;
		}
	}

}*/


int main()
{
	setlocale(LC_ALL, "ru"); 
	//Ifs_Ofs_cpy1();
	Ifs_Ofs_cpy2();
	//Ifs_Ofs_cpy3();
	return 0;
}