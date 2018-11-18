#include<iostream>
#include<string>

using namespace std;

int main()
{
    string s1,s2,s3;
    cin >> s1;
    for (int i = 0 ; i < s1.length() ; i++){
        s2 += tolower(s1[i]);
    }
    for (int i = 0 ; i < s2.length() ; i++){
        if (s2[i] == 'a' || s2[i] == 'e' || s2[i] == 'i' || s2[i] == 'o' || s2[i] == 'u' || s2[i] == 'y'){
            continue;
        }
        else{
            s3 += ".";
            s3 += s2[i];
        }
    }
    
    cout << s3 << endl;
    return 0;
}
