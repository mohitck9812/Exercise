// task 6

const finalArray = document.getElementById("finalArray");
const oldNumber = document.getElementById("oldNumber");
const newNumber = document.getElementById("newNumber");
const replaceBtn = document.getElementById("replaceBtn");

let arr = [3, 6, 1, 34, 9, 62, 2, 6, 34, 1];
finalArray.textContent = `Array: [ ${arr.join(", ")} ]`;

replaceBtn.addEventListener("click", () => {
  const oldNum = oldNumber.value;
  const newNum = newNumber.value;
  if (oldNum !== "" && newNum !== "") {
    arr = arr.map((num) => num == oldNum ? newNum : num);
    finalArray.textContent = `Array: [ ${arr.join(", ")} ]`;
    newNumber.value = "";
    oldNumber.value = "";
  }
  else{
    alert("Enter a valid vlaue");
  }
});


//only js without involment of any html


// let arr = [3, 6, 1, 34, 9, 62, 2, 6, 34, 1];

// console.log("Original Array:", arr);

// function replaceNumber(arr, oldNum, newNum) {
//   if (typeof oldNum !== 'number' || typeof newNum !== 'number') {
//     console.log("Enter valid numeric values.");
//     return arr;
//   }

//   const updatedArr = arr.map(num => num === oldNum ? newNum : num);

//   return updatedArr;
// }

// //example
// const oldNum = 6;
// const newNum = 100;

// arr = replaceNumber(arr, oldNum, newNum);

// console.log("Updated Array:", arr);

