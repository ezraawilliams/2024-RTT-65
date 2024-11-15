const input = prompt("Enter a range of two numbers, separated by a space (e.g. 23 34): ");
let [min, max] = input.split(" ");
const guess = Math.floor(Math.random() * (Number(max) - Number(min) + 1) + Number(min));

let limiter = 0;
let userGuess;

while (limiter <= 10) {
  userGuess = prompt("Guess a number between "+min+ " and " +max+": ");
/* How do we adjust the range of min and max per user guess
if the random number is 25,  and the user guesses below,
the range should now be 23 - 25 instead
of 23 to 34.
 */
  //else if (userGuess != guess){
  //  alert("Nope! You have these number of guessed left "+limiter);
      if (userGuess < guess){
        min = userGuess + 1;
      } else if (userGuess > guess) {
         max = userGuess - 1;
      } else {
        alert("You got it: " + userGuess);
          break;
  }
  limiter++;
}

if (guess != userGuess){
  alert("Sorry, the answer was: " + guess);
}
