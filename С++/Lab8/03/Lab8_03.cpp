#include <iostream>
#include <fstream>
#include <stdlib.h>
#include <ctype.h>


using namespace std;
int main(){
	char nameA[50], nameB[50], key[50];
    int indexKey = 0;
	
    printf("Enter input file name: ");
    scanf("%s", nameA, (unsigned)_countof(nameA));
    printf("Enter output file name: ");
    scanf("%s", nameB, (unsigned)_countof(nameB));
    printf("Enter key: ");
    scanf("%s", key, (unsigned)_countof(key));

    ifstream in(nameA);
    ofstream out(nameB);

	if ((in.is_open()) && (out.is_open())) {
        while (true) {
            char ch;
            in.get(ch);

            char newCh = ch ^ key[indexKey];

            if (in.eof()) {
                break;
            }
            printf("%c-%c ", key[indexKey],newCh);
            out.put(newCh);
            if (indexKey < strlen(key) - 1) {
                indexKey++;
            }
            else {
                indexKey = 0;
            }

        }
        in.close();
        out.close();
    }

		else {
		printf("Files %s or %s not open!", nameA, nameB);
		return -1;
	}
    cin.ignore();
    cin.get();
	return 0;
}