//task 3

const finalArray = document.getElementById('finalArray');
const addNumber = document.querySelector('form');
const inputNumber = document.getElementById('numberInput');

const arr = [];

addNumber.addEventListener('submit', (e) => {
    e.preventDefault();
    const num = inputNumber.value;

    if (num !== '') {
        arr.push(Number(num));
        finalArray.textContent = `Array: [ ${arr.join(', ')} ]`;
        inputNumber.value = '';
    } else {
        alert('Please enter a number!');
    }
});
