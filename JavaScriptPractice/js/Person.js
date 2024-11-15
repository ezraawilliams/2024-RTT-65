// Class Declaration
class Person {
  static species = "Human";

  constructor(firstName, lastName, age, eyeColor) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.years = age;
    this.eyeColor = eyeColor;
  }
  get name() {
    return this.firstName + " " + this.lastName;
  }
  set age(new_age) { this.years = new_age; }
  get age() { return this.years; }

  static greet() {
    // Math.random() is also a static method!
    if (Math.random() <= 0.5)
      console.log("Hello!");
    else
      console.log("Hi!");
  }
};
const myFather = new Person("John", "Doe", 50, "blue");
console.log(myFather.firstName);	// John
console.log(myFather.lastName);	// Doe
console.log(myFather.name);	// John Doe
myFather.age = 51;
console.log(myFather.age);		// 51

console.log(myFather.species);	// undefined
console.log(Person.species);	// Human
Person.greet();
