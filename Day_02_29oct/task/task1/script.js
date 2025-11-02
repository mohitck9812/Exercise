const userName = document.getElementById("name");
const ageInput = document.getElementById('age');
const submitButton = document.getElementById('submit');
const message = document.getElementById('message');
const form = document.getElementById('userForm');

form.addEventListener('submit', function(e){
  e.preventDefault();
    const name = userName.value.trim();
      const age = Number(ageInput.value);

      // Validation
      if (name === '') {
        message.textContent = 'Please enter your name.';
        message.className = 'error';
      } else if (isNaN(age) || age < 18) {
        message.textContent = 'You must be at least 18 years old.'; 
      } else {
        message.textContent = 'Form submitted successfully!';
        // form.submit();
      }
})
