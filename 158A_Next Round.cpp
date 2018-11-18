#include<iostream>

using namespace std;

int main()
{
    int n,k;
    cin >> n >> k;
    
    int arr[50];
    for (int i = 0 ; i < n ; i ++){
        int j;
        cin >> j;
        arr[i] = j;
    }
    
    //the kth' place finisher is index of k-1
    
    int base_index = arr[k-1];
    int tempCount = 0;
    for (int i = k ; i < n ; i++){
        if (arr[i] == base_index && arr[i] > 0){
            tempCount++;
        }
    }
    if (base_index != 0){
        cout << tempCount + k << endl;
    }
    
    int BREAKER = -1;
    
    if (base_index == 0){
        for (int i = k-1 ; i >= 0 ; i--){
            
            if (arr[i] != 0){
                BREAKER = i;
                break;
            }
        }
        /*if (BREAKER != 0){
            cout << BREAKER + 1 << endl;
        }
        if (BREAKER == 0){
            cout << BREAKER << endl;
        }*/
        cout << BREAKER + 1 << endl;
    }
    
    
    return 0;
}
