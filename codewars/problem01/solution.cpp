#include <iostream>
#include <string>

using namespace std; 
string sliceString (string str )
{
  return string(str.begin()+1,str.end()-1) ; 
}
/*
string sliceString (string str )
{
  int len = str.length();
  string str2 = str.substr (1, len-2);
  return str2;
  
}
*/

int main(int argc, char *argv[]) {
    string input = argv[1];
    string answer = sliceString(input);
    cout << answer << endl;
}