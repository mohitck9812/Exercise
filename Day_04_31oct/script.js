// 1. Convert to Arrow Function

const add = (a, b) => a + b;

add(2, 3);

// 2. Default Parameters

function greet(name = "", message = "Welcome !") {
  console.log(message + " " + name);
}

greet();
greet("Mohit");
greet("Mohit", "Have a great day");

// 3. Template Literals

function formatString(name, age) {
  if (!!name && !!age) {
    console.log(`Hello, my name is ${name} and I am ${age} years old.`);
  } else {
    console.log("Enter Valid input");
  }
}

formatString("Mohit", 23);

// 4. Object Destructuring

const person = {
  name: "Alice",
  age: "25",
  address: {
    city: "New York",
    country: "NY",
  },
};

function objDestructure() {
  const {name= "", address: {city="unknown city", country="unknown country"}={} }= person || {};
  console.log(`${name} lives in ${city}`);
  console.log(
    `City: ${city} and that is in ${country} country`
  );
}

objDestructure();

// 5. Rest Operator

function sumAll(...args) {
  return args.reduce((acc, val) => acc + val, 0);
}

console.log(sumAll(1, 2, 3, 4, 5, 6));

// 6. Filter Even Numbers
arr = [1, 2, 3, 4, 5, 6]; // will be used further

function filterEvens(args) {
  return args.filter((i) => i % 2 === 0);
}

filterEvens(arr);

// 7. Array Mapping

function doubleValues(arr) {
  return arr.map((i) => i * 2);
}

doubleValues(arr);

// 8. Find the Maximum

function findMax(arr) {
  return Math.max(...arr);
}

findMax(arr);

// 9. Object and Array Destructuring

const data = [
  {
    name: "Bob",
    age: 24,
  },
  {
    name: "Alice",
    age: 21,
  },
];

function extractAndDisplay() {
  const [{age}, {name}] = data
  return `${name}'s age is ${age}`;
}

console.log(extractAndDisplay());

// 10. Data Manipulation using Array functions

const input = [
  {
    id: 1,
    title: "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
    price: 109.95,
    description:
      "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
    category: "men's clothing",
    image: "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
    rating: {
      rate: 3.9,
      count: 120,
    },
  },
];

function getSelectedKeys(input) {
  const selectedKeys = [];

  input.forEach((element) => {
    const { id, title, rating: { rate, count } } = element;
    selectedKeys.push({ id, title, rate, count });
  });

  return selectedKeys;
}

console.log(getSelectedKeys(input));

// 11. Default Parameter

 const fun = (name = "abc") => {
        if (name) {
          console.log("if", name);
        } else {
          console.log("else", name);
        }
      };
	  
fun(""); // else

// 12. Deep Clone Objects

//using JSON.stringify() and  JSON.parse()
// const obj2 = JSON.parse(JSON.stringify(obj));


function deepClone(obj){
    if (typeof obj !== "object" || obj === null) {
    return obj;
  }

  const clone = {};
  for (let key in obj) {
    clone[key] = deepClone(obj[key]);
  }

  return clone;
}

const obj = { a: 1, b: { c: 2 } };

const deepCopy = deepClone(obj);

//test
console.log("Original - " + JSON.stringify(obj));
console.log("Clone - " + JSON.stringify(deepClone));
deepCopy.a = 50;
deepCopy.b.c = 40; 
console.log('After change :');
console.log("Original - " + JSON.stringify(obj));
console.log("Clone - " + JSON.stringify(deepClone));

// 13. Flatten Nested Arrays

function flattenArray(arr){
    const result =[]
    arr.forEach(ele => {
        if(Array.isArray(ele)){
            result.push(...flattenArray(ele));
        }
        else{
            result.push(ele);
        }
    })
    return result;
}

const nestedArr = [1, [2, [3, [4, 5]]]];
console.log(flattenArray(nestedArr));