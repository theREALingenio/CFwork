#include<iostream>
#include<cmath>

using namespace std;

int main()
{
    int arr[5][5];
    int x = 0 ;
    for (int r = 0 ; r < 5 ; r++){
        for (int c = 0 ; c < 5 ; c++){
            cin >> x;
            arr[r][c] = x;
            
            if (arr[r][c] == 1){
                cout << abs(r-2)+abs(c-2) << endl;
            }
        }
    }
    
    return 0;
    
}
