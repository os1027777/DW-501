var docStyle = document.documentElement.style;

// setting CSS variables inside this JS where they 
// can be declaratively used inside the CSS file.
document.addEventListener('mousemove', function(e) {
  docStyle.setProperty('--mouse-x', e.clientX);
  docStyle.setProperty('--mouse-y', e.clientY);
});

document.getElementById("js").onclick = function () {
  alert("1");
};

const myButton = document.getElementById("jg");

myButton.addEventListener('click', () => {
  let randomBrightColor = () => {
    let color_r = Math.floor(Math.random() * 127 + 128).toString(16);
    let color_g = Math.floor(Math.random() * 127 + 128).toString(16);
    let color_b = Math.floor(Math.random() * 127 + 128).toString(16);
    return `#${color_r+color_g+color_b}`;
  }
  
  for(td of document.getElementsByTagName('body',)){
    td.style.backgroundColor = randomBrightColor();
  }
});



