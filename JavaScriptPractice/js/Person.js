// Class Declaration
class Person {
  static species = "Human";
  #firstName; #lastName; #years; #eyeColor;

  constructor(firstName, lastName, age, eyeColor) {
    this.#firstName = firstName;
    this.#lastName = lastName;
    this.#years = age;
    this.#eyeColor = eyeColor;
  }
  get name() {
    return this.#firstName + " " + this.#lastName;
  }
  set age(new_age) { this.#years = new_age; }
  get age() { return this.#years; }
  static greet() {
    if (Math.random() <= 0.5)
      console.log("Hello!");
    else
      console.log("Hi!");
  }
};

class Learner extends Person{
  #grades = [];
  set grade(new_grade) {
    this.#grades.push(new_grade);
  }
  get average() {
    let total = 0;
    for (let i = 0; i < this.#grades.length; i++) {
      total += this.#grades[i];
    }
    return Math.round(total/this.#grades.length);
  }

};

/*const myFather = new Person("John", "Doe", 50, "blue");
console.log(myFather.firstName);	// John
console.log(myFather.lastName);	// Doe
console.log(myFather.name);	// John Doe
myFather.age = 51;
console.log(myFather.age);		// 51

console.log(myFather.species);	// undefined
console.log(Person.species);	// Human
Person.greet();*/

const myFather = new Learner("John", "Doe", 50, "blue");
myFather.grade = 100; // Note how these statements do
myFather.grade = 85;  // not change a property called
myFather.grade = 96;  // called “grade”; instead,
// they call our setter method
console.log(myFather.average);	// 94
console.log(myFather.name);	// John Doe
