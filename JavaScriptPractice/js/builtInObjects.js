/*
// new Date()
const d = new Date();
console.log(d);
// new Date(year, month, ...)
const d = new Date(2021,11,24,10,33,30,0);
console.log(d);
const d = new Date(2021, 11, 24);
console.log(d);
// new Date(dateString)
const d = new Date("October 13, 2021 11:13:00");
console.log(d);
// new Date(milliseconds)
const d = new Date(86400000);
console.log(d);

let first = new Date ('January 1, 2019 04:30:00');
let second = new Date('2019-01-01T04:30:00');
console.log(first); 	// Tue Jan 01 2019 04:30:00 GMT-0600
console.log(first.getTime() == second.getTime());	// true
console.log(second.getHours());					// 4
console.log(first.setMinutes(45));				// 1546339500000
console.log(first.getMinutes());
*/
//Number: wrapper similar to Java
const str = "23";
const num = Number(str);
console.log(typeof num); // number

console.log(Number(340900000000000000).toExponential()); // 3.409e+17

//Math
Math.PI;				// returns 3.141592653589793
// Math.round(x) 		   returns the value rounded to its nearest integer
Math.round(4.7);	// returns 5
Math.round(4.4);	// returns 4
// Math.pow(x, y)  	   returns the value of x to the power of y
Math.pow(8, 2);	// returns 64
// Math.sqrt(x) 		   returns the square root of x:
Math.sqrt(64);		// returns 8
// Math.ceil(x) 		   returns the value rounded up to nearest integer
Math.ceil(4.4);	// returns 5
// Math.floor(x) 		   returns the value rounded down to nearest integer
Math.floor(4.7);	// returns 4

// Return a range of whole-number values
// from min (inclusive) to max (inclusive)
const min = 5;
const max = 10;
let value = Math.floor(Math.random() * (max - min + 1) + min);
console.log(value);

function randomWholeNumber(min, max) {
  return Math.floor(Math.random() * (max - min + 1) + min);
}
console.log(randomWholeNumber(5, 10)); 	// numbers from 5 to 10
console.log(randomWholeNumber(7, 42)); 	// numbers from 7 to 42	console.log(randomWholeNumber(1, 100)); 	// numbers from 1 to 100	console.log(randomWholeNumber(-10, 10)); 	// numbers from -10 to 10	console.log(randomWholeNumber(-4, 20)); 	// numbers from -4 to 20


