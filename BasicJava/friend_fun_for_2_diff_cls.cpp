#include<iostream>
using namespace std;

// A friend function  friendly with two classes 
// 12/03./22
//friend_fun_two_diff_class.cpp
class SECOND;
class FIRST{
	private :
		
		int x;
	public:
		void getx(int a){
			x=a;
		}
		void displayX(){
			cout<<" the value of x is " <<x<<endl;
		}
		
		void friend great( FIRST , SECOND);
	
};



class SECOND{
		int y;
	public:
		void getx(int a){
			y=a;
		}
		void displayX(){
			cout<<" the value of y is " <<y<<endl;
		}
		
		void friend great( FIRST , SECOND);
	
	
};

void great( FIRST f1 , SECOND s1){
	
	if (f1.x > s1.y){
		cout<<" the value of first class object is big value "<<f1.x<<endl;
	}
	else{
		cout<<" the value of second  class object is big value "<<s1.y<<endl;
	}
}

int main(){
	FIRST obj1;
	SECOND obj2;
	obj1.getx(22);
	obj2.getx(30);
	
	obj1.displayX();
	obj2.displayX();
	great(obj1 , obj2);
	
	return 0;
}


