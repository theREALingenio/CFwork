#include <iostream>
using namespace std;
int main()
{
    int i,n,p,k;
    cin>>n>>p>>k;
    if(p-k>1){
        cout<< "<< ";
    }
    for(i=p-k;i<=p+k;i++)
    {
        if(i==p){
            cout<< "("<<i<<")";
            cout << " ";
        }
        
        else if (i>0 &&i<=n){
            cout<<i<< " ";
        }
    }
    if(p+k<n){
        cout<<">>";
    }
}
