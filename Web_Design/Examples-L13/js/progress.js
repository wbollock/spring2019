function frame() {
  
  if (width == 100) {
    clearInterval(id);
  } 
  else {
    width++; 
    elem.style.width = width + '%'; 
  }
}

function move() {  
  id = setInterval(frame, 10);
}

var width = 0;
var elem = document.querySelector("#myBar");   
var id;

const button = document.querySelector('button');
button.addEventListener('click', move);

