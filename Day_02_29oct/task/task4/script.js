//task 4

const finalArray = document.getElementById('finalArray');
const removeNumber = document.getElementById('removeNumber');

const arr = [3,6,1,34,9,62,2];
finalArray.textContent = `Array: [ ${arr.join(', ')} ]`;

removeNumber.addEventListener('click', () => {
    if (arr.length != 0) {
    arr.splice(0,1);
    finalArray.textContent = `Array: [ ${arr.join(', ')} ]`;
    } else {
    alert('Array is already empty');
    }
});

// only js version without dom

// let arr = [3, 6, 1, 34, 9, 62, 2];

// console.log("Initial Array:", arr);

// function removeFirstElement(arr) {
//   if (arr.length !== 0) {
//     arr.splice(0, 1); // remove first element
//     console.log("Updated Array:", arr);
//   } else {
//     console.log("Array is already empty");
//   }
//   return arr;
// }

// // Example usage:
// removeFirstElement(arr);
// removeFirstElement(arr); 
// removeFirstElement(arr);
