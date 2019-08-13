#include <iostream>
using namespace std;

int main() {
    char c;
    cin>>c;
    if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
    {
        
           if((c== 'a'||c== 'e'||c== 'i'||c== 'o'||c== 'u'))
           {
               cout<<"Vowels";
           }
           else
           {
               cout<<"Consonant";
           }
    }
    else
    {
        cout<<"invalid";
    }
	return 0;
}
