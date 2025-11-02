//task 3

const finalArray = document.getElementById('finalArray');
const addNumber = document.getElementById('addNumber');
const inputNumber = document.getElementById('numberInput');

const arr = [];

addNumber.addEventListener('click', () => {
    const num = inputNumber.value; 

    if (num !== '') {
    arr.push(Number(num));
    finalArray.textContent = `Array: [ ${arr.join(', ')} ]`;
    inputNumber.value = ''; 
    } else {
    alert('Please enter a number!');
    }
});