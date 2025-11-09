#include<iostream>
using namespace std;

class circle{
    private:
        int area;
        int radius;
    public:

    void calculate()
    {
        cout<<"enter radius:";
        cin>>radius;
        area=3.14*radius*radius;
    }
    void display()
    {
        cout<<"area calculation:"<<area;
    }
};
int main()
{
    circle c;
    
    c.calculate();
    c.display();
}