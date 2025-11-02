const area = document.getElementById('playArea');

area.addEventListener('mouseenter', () => {
  area.style.backgroundColor = 'blue';
});

area.addEventListener('mouseleave', () => {
  area.style.backgroundColor = 'red';
});