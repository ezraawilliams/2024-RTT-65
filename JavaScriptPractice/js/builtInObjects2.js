//Arrays:
const a = [];			// an empty array
a[0] = 3;				// initializing value 3 at index 0
console.log(a[0]);		// accessing index 0, which prints 3
a[1] = a[0] - 3;		// a[1] now contains the value 0
console.log(a[a[1]]);	// a[1] returns 0, which accesses a[0] and print 3
console.log(a[10]);	// undefined

const objArray = [{ key1: "value1" }, { key2: "value2" }];
// ArrayName[array_index][object_key]
console.log(objArray[0]["key1"]);	// value1

const multiArray = [
  [{ key1: "value1", key2: "value2" },
    { key1: "value3", key2: "value4" }],
  [{ key1: "value5", key2: "value6" },
    { key1: "value7", key2: "value8" }]
];
// ArrayName[array_index][internal_array_index][object_key]
console.log(multiArray[1][0]["key2"]);	// value6
console.log(multiArray[1][1]);

[].length; 				// no elements, length is 0
[2, 3, 5, 7, 11].length; 	// five elements, length is 5, highest index is 4


const b = [2, 3, 5, 7, 11]; 	// five elements, length is 5
b.length = 2;				// two elements, [2, 3]
console.log(b);
b.length = 5;				// five elements, [2, 3, undefined, undefined, undefined]
console.log(b);

const c = [];			// an empty array
//c[0] = 3;
c.push(3);				// a = [3]
c.push(4, 5, 6);		// a = [3, 4, 5, 6]
console.log(c);

const d = [4, 5, 6];		// a = [4, 5, 6]
const e = d.pop();		// a = [4, 5]; b = 6
console.log(e);
console.log(d);
const f = d.shift();		// a = [5]; c = 4
console.log(f);
console.log(d);

const g = [1, 2, 3];		// a new array with three elements
console.log(g);
const x = g.join();		// “1,2,3”
console.log(x);
const y = g.join(" ");		// “1 2 3”
console.log(y);
const z = g.join("");		// “123”
console.log(z);
const h = new Array(10);	// a new array with ten empty elements
const k = h.join("-");		// “---------” (a string with nine hyphens)
console.log(k);

const l = [1, 2, 3];			// a new array with three elements
let m = l.reverse().join();	// m = “3,2,1”
console.log(l);				// [3, 2, 1]
console.log(m);				// 3,2,1

let n = ["banana", "cherry", "apple"];
n.sort();
const s = n.join(" is good, ");
console.log(s);		// apple is good, banana is good, cherry
let fruits = ["banana", "orange", "apple", "mango"];
fruits.sort();
console.log(fruits);	// [“Apple”, “Banana”, “Mango”, “Orange”]

const a1 = [1, 2, 3, 4, 5];
const w1 = a1.slice(0, 3);	// w = [1, 2, 3]
const x1 = a1.slice(3);		// x = [4, 5]
const y1 = a1.slice(1, -1);	// y = [2, 3, 4]
const z1 = a1.slice(-3, -2);	// z = [3]
console.log(a1);			// [1, 2, 3, 4, 5]
console.log(w1);
console.log(x1);
console.log(y1);
console.log(z1);
const languages = ["JavaScript", "Python", "C", "C++", "Java"];
// slicing the array from start to second-to-last element
let new_arr = languages.slice(0, -1);
console.log(new_arr); // ['JavaScript', 'Python', 'C', 'C++']
// slicing the array from third-to-last to last element
let new_arr1 = languages.slice(-3);
console.log(new_arr1); // ['C', 'C++', 'Java']

//Splice:
let fruits1 = ["banana", "orange", "apple", "mango"];
fruits1.splice(2, 0, "lemon", "kiwi");
console.log(fruits1);
// [“banana”, “orange”, “lemon”, “kiwi”, “apple”, “mango”]

let fruits3 = ["banana", "orange", "apple", "mango"];
fruits3.splice(2, 2, "lemon", "kiwi");	// removes 2 elements
console.log(fruits3);				// [“banana”, “orange”, “lemon”, “kiwi”]
const a2 = [1, 2, 3, 4, 5, 6, 7, 8];
const x2 = a2.splice(4);				// x = [5, 6, 7, 8]; a = [1, 2, 3, 4]
console.log(a2);
console.log(x2);
const y2 = a2.splice(1, 2);			// y = [2, 3]; a = [1, 4]
console.log(a2);
console.log(y2);
const z2 = a2.splice(1, 1);			// z = [4]; a = [1]
console.log(a2);
console.log(z2);
const b2 = [1, 2, 3, 4, 5];
const m2 = b2.splice(2, 0, "a", "b");	// m = []; b = [1, 2, “a”, “b”, 3, 4, 5]
console.log(b2);
console.log(m2);
const n2 = b2.splice(2, 2, [1, 2], 3);	// n = [“a”, “b”];
// b = [1, 2, [1, 2], 3, 3, 4, 5]
console.log(b2);
console.log(n2);

let a3 = [23, 32, 45, 67, 77, 67, 98, 12];
for (let i = 0; i < a3.length; i++) {
  console.log(a3[i]);	// will output each element of the array
}

let a4 = [23, 32, 45, 67, 77, 67, 98, 12];
for (const index in a4) {
  console.log(a4[index]);	// will output each element of the array
}

const person = {
  firstName: "John",
  lastName: "Doe",
  age: 50,
  eyeColor: "blue"
};
for (const personKey in person) {
  console.log(personKey + ": " + person[personKey]);
}
