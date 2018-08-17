/* JS HW Part ONE

Due: 5pm Friday, August 17

Fill in the functions and submit them to your repository in a file called JSHWPart1.js*/

var homework = {};

/*
 1. Return the nth fibonacci number

 f(0) = 0
 f(1) = 1
 f(10) = 55
*/
homework.fibonacci = function(n){
	if(n == 0)
		return 0;
	if(n == 1)
		return 1;
	
	return n + homework.fibonacci(n-1);
};

/*
 2. Sort array of integers

 f([2,4,5,1,3,1]) = [1,1,2,3,4,5]

 Don't use the Array sort() method... that would be lame.
*/
homework.sort = function(array) {
	
	if(array.length < 1)
		return array;
	if(array.length == 1)
		return array;
  
	arr = array.slice();
	while(array.length > 0) {
		for(var i = 0; i < array.length; ++i) {
			var min = array[i];
			for(var t = 0; t < array.length;++i) {
				
			}
				
		}
	}
	

};

/*
 3. Return the factorial of n

 f(0) = 1
 f(1) = 1
 f(3) = 6
*/
homework.factorial = function(n){
	if(n == 0)
		return 1;
	if(n == 1)
		return 1;
	return n * homework.factorial(n-1);
};

/*
 4. Rotate left

 Given array, rotate left n times and return array

 f([1,2,3,4,5], 1) = [2,3,4,5,1]
 f([1,2,3,4,5], 6) = [2,3,4,5,1]
 f([1,2,3,4,5], 3) = [4,5,1,2,3]

*/
// Write JavaScript here and press Ctrl+Enter to execute

homework.rotateLeft = function(array, n) {
	if(array.length < n)
  	return "Error: n is larger than 0";
  if(array.length == 0)
  	return array;
  
	var arr = array.slice();
  var counter = n;
	for(var i = 0; counter < array.length; ++i) {
  	arr[i] = array[counter];
    ++counter;
  }
  var counter2 = 0;
  var startPoint = array.length - n;
  
  for(var i = startPoint; i < array.length; ++i) {
    arr[i] = array[0];//array[counter2];
    counter2++;
  }
  return arr;
};

/*
 5. Balanced Brackets

 A bracket is any one of the following: (, ), {, }, [, or ]

 The following are balanced brackets:
    ()
    ()()
    (())
    ({[]})

 The following are NOT balanced brackets:
 (
 )
 (()
 ([)]

 Return true if balanced
 Return false if not balanced
*/
homework.balancedBrackets = function(bracketsString){
	bracketsString = bracketsString.trim();
	if(bracketsString.length == 0)
		return false;
	if(bracketsString.length == 1)
		return false;
	

};
/*

YOUR SOLUTIONS, NOT STACKOVERFLOW’S  ;)
*/