#include<iostream>
#include<string>
using namespace std;

int main()
{
    string s;
    cin >> s;
    if (s.length() < 7){
        cout << "NO" << endl;
        return 0;
    }
    for (int i = 0 ; i <= s.length() - 7; i++){
        if (s[i]==s[i+1] && s[i]==s[i+2] && s[i] == s[i+3] && s[i] == s[i+4] && s[i] == s[i+5] && s[i] == s[i+6]){
            cout << "YES" << endl;
            return 0;
          
            }
    }
    cout << "NO" << endl;
    return 0;
}
