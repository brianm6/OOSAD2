#include <iostream>
#include "firstlib.h"
 
int main() {
	printGreeting();
	std::cout << "Please enter number of days for the forcast" << std::endl;
	int days;
	std::cin >> days;
	weatherForcast(days);
	std::string loc;
	getMyLocation(loc);
	std::cout << "Location: " << loc << std::endl;
	courseStruct cs;
	cs.name = "C++";
	cs.days = 21;
	printCourse(cs);	
	return 0;
}
