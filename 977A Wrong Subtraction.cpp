#include<iostream>
using namespace std;

int subtract(long a, int b){
    for (int i = 0; i < b ; i++){
        if (a % 10 == 0){
            a = a / 10;
        }else{
            a = a-1;
        }
    }
    return a;
}

int main()
{
    long a = 0;
    int b = 0;
    cin >> a >> b;
    
    cout << subtract(a,b) << endl;
}
