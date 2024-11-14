/*
Consider this investment problem:
Starting with $10,000, how many years will it take to double that initial balance to reach $20,000 at 5% interest?
The algorithm we will use:
Start with a year value of 0 and a balance of $10,000.
Repeat the following steps while the balance is less than $20,000:
Add 1 to the year value.
Compute the interest by multiplying the balance value by 0.05 (5% interest). This rate will be declared as a const.
Add the interest to the balance.
Report the final year value as the answer.
 */
let year = 0;
let balance = 10000.00;
const interestRate = 0.05;
let accumulatedInterest = 0.0;

while (balance<=20000.00){
  accumulatedInterest=balance*interestRate;
  balance+=accumulatedInterest;
  year++;
}
console.log("It took this many years to arrive at 20,000.00: "+year);

//Other while() examples:
/*let i=5;
while (i > 5) {
  console.log(i + " ")
  i++;
}

for (let i = 0; i <= 5; i++) {
  console.log(i + " ")
}

for (let i = 5; i >= 0; i--) {
  console.log(i + " ")
}*/

for (let i = 0; i != 9; i += 2) {
  console.log(i + " ")
}



