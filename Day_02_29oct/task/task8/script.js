// task 8


const finalArray = document.getElementById('finalArray');
const addNumber = document.getElementById('addNumber');
const inputNumber = document.getElementById('numberInput');
const revDisplay = document.getElementById('reverseDisplay');

const arr = [];

function appendArr(){
    const num = inputNumber.value; 

    if (num !== '') {
    arr.push(Number(num));
    finalArray.textContent = `Array: [ ${arr.join(', ')} ]`;
    const revArr = [];
    arr.forEach((i) => {revArr.splice(0,0,i)});
    revDisplay.textContent = `Reverse Array: [ ${revArr.join(', ')} ]`;
    inputNumber.value = ''; 

    } else {
    alert('Please enter a number!');
    }


}

addNumber.addEventListener('click', appendArr);
inputNumber.addEventListener('keydown', (e)=>{
    if (e.key === "Enter") {
    appendArr();
  }
});

