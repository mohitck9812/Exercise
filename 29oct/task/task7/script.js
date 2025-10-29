let arr = [3, 6, 1, 34, 9, 62, 2, 6, 34, 1];
const display = document.getElementById("display");
display.textContent = `Array: [ ${arr.join(", ")} ]`;

const sort = document.getElementById("sortBtn");

sort.addEventListener('click', () =>{
    for (let i = 0; i < arr.length - 1; i++) {
  for (let j = 0; j < arr.length - i - 1; j++) {
    if (arr[j] > arr[j + 1]) {
      let temp = arr[j];
      arr[j] = arr[j + 1];
      arr[j + 1] = temp;
    }
  }
}
display.textContent = `Array: [ ${arr.join(", ")} ]`;
})

// only js code without involment of html

// let arr = [3, 6, 1, 34, 9, 62, 2, 6, 34, 1];

// for (let i = 0; i < arr.length - 1; i++) {
//   for (let j = 0; j < arr.length - i - 1; j++) {
//     if (arr[j] > arr[j + 1]) {
//       let temp = arr[j];
//       arr[j] = arr[j + 1];
//       arr[j + 1] = temp;
//     }
//   }
// }

console.log("Sorted Array:", arr);
