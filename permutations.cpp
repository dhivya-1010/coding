#include<iostream>
#include<vector>
#include<string>
using namespace std;

void dfs(string input,string path,vector<bool>& used){
    if(path.size()==used.size()){
        cout<<path<<endl;
        return;
    }
    for(int i=0;i<input.size();i++){
        if(used[i]) continue;
        used[i]=true;
        dfs(input,path+input[i],used);
        used[i]=false;
    }

}

int main(){
    string input = "abc";
    vector<bool>used(input.size(),false);
    dfs(input,"",used);
}