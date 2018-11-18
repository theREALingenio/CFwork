#include<iostream>
#include<string>

using namespace std;

int main()
{
    string s;
    cin >> s;
    
    int countT = 0;
    int countE = 0;
    int countN = 0;
    int countI = 0;
    
    for (int i = 0 ; i < s.length() ; i ++){
        if (s[i] == 't'){
            countT++;
        }
        if (s[i] == 'e'){
            countE++;
        }
        if (s[i] == 'n'){
            countN++;
        }
        if (s[i] == 'i'){
            countI++;
        }
    }
    
    int ans = countE / 3;
    if (countI < ans){
        ans = countI;
    }
    if (countT < ans){
        ans = countT;
    }
    if ((countN-1)/2 < ans){
        ans = (countN-1)/2;
    }
    
    cout << ans << endl;
    return 0;
}
