#include<iostream>
#include<string>
using namespace std;

int main()
{
    int n ;
    cin >> n;
    
    int arr[] = {4,7,47,74,444,447,474,744,477,747,774,777};
    
    for (int i = 0 ; i < 10; i++){
        if (n == arr[i] || n % arr[i] == 0){
            cout << "YES" << endl;
            return 0;
        }
    }
    cout << "NO " << endl;
    return 0; 
}
