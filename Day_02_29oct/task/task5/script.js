//task 5

const finalArray = document.getElementById("finalArray");
const addNumber = document.querySelector('form');
const inputNumber = document.getElementById("numberInput");
const inputIndex = document.getElementById("indexInput");

const arr = [];

addNumber.addEventListener("submit", (e) => {
  e.preventDefault();
  const num = inputNumber.value;
  const idx = inputIndex.value;
  if (num !== "" && idx !== "") {
    if (idx <= arr.length) {
      arr.splice(idx, 0, num);
      finalArray.textContent = `Array: [ ${arr.join(", ")} ]`;
      inputNumber.value = "";
      inputIndex.value = "";
    } else {
      alert("Please enter a valid index");
    }
  } else {
    alert("Please enter a number!");
  }
});


// js version only without involment of any dom

// const arr = [];

// function insertAtIndex(arr, num, idx) {
//   if (typeof num !== "number" || typeof idx !== "number") {
//     console.log("Please enter valid numeric values.");
//     return arr;
//   }

//   if (idx < 0 || idx > arr.length) {
//     console.log("Please enter a valid index.");
//     return arr;
//   }

//   arr.splice(idx, 0, num);
//   return arr;
// }

// // Example usage:
// console.log("Initial Array:", arr);

// let num = 10;
// let idx = 0;
// insertAtIndex(arr, num, idx);
// console.log("After inserting 10 at index 0:", arr);

// num = 25;
// idx = 1;
// insertAtIndex(arr, num, idx);
// console.log("After inserting 25 at index 1:", arr);

// num = 5;
// idx = 2;
// insertAtIndex(arr, num, idx);
// console.log("After inserting 5 at index 2:", arr);
