/*Variables in JavaScript:
To declare a variables:
var
let
const
 */
var myVariables="Some value";
let mySecond=true;
const PI = 3.141592653589793;
let my_variable=1.5;

let x = 10
//Here x is 10
let age = 25
{
  let x = 2;
  //Within this block, x is now 2
  console.log(x);
}
console.log(x);
//Outside of the block, x is 10

var counter = 1;
// Do something with this counter.


// Then, some many lines later...
if (true) {
  var counter = 2;
  // Do something with this other counter.

  console.log("Inside " + counter);
}

// Which counter are we referencing here?
console.log("Outside " + counter);

console.log(3 > 4 && 4 == 4)//true or false? false
console.log(3 > 4 || 4 == 4)//true
console.log(5 != 5 || 4 > 4) && !(2 == 2)//false
console.log(5 % 2 >= 2) && (!false || 4 < 0)//false
console.log(2 >= 2 && 10 % 3 == 1) || ((10 < 11 && 2 != 3) || 2 == 12) //true
console.log(5 <= 3 || 6 > 0) && (20 % 3 == 2 && 88 / 2 > 30) //true

console.log("Hello" + " World"); // outputs: Hello World
console.log("This is" + " a String"); // outputs: This is a String
console.log("The number is " + 5); // outputs: The number is 5
console.log("Hello" - " World"); // Invalid, cannot use -

console.log()// is true,
console.log("3" ==  3)// “3” ==  3 is true, and
console.log(0 == false)// 0 == false

console.log(3 === 3)// is true, but
console.log("3" === 3)// “3” === 3 is false.

