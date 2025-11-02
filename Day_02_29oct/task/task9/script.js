const arr = [ 3, 6, 1, 34, 9, 62, 2 ];

document.getElementById('initialArray').textContent = `Array: [ ${arr.join(', ')} ]`

const btn = document.querySelector('form');
const result = document.getElementById('result');
const num = document.getElementById('searchVal');

btn.addEventListener('click', (e) => {
    e.preventDefault();
    if(num.value !== ""){
        const idx = arr.findIndex((n) => n == num.value);
        if(idx == -1){
            result.textContent = "Number not found."
        }else{
            result.textContent = `Number found at index: ${idx + 1}`;
        }
    }else{
        alert("Enter any value");
    }
})