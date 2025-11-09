#include<iostream>
#include<string>
#include<algorithm>

using namespace std;
int main(){
    string s = "";
    int n = 7;
    while(n!=0){
        if(n%2==0) s+="0";
        else if(n%2==1) s+="1";
        n/=2;
    }
    reverse(s.begin(),s.end());
    cout<<s;
}