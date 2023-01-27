$(document).ready(function($) {

    $(".scroll_move").click(function(event){         

            event.preventDefault();

            $('html,body').animate({scrollTop:$(this.hash).offset().top}, 500);

    });

});

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



window.addEventListener('load', function() { 
    var allElements = document.getElementsByTagName('*');
    Array.prototype.forEach.call (allElements, function(el) {
        var Path = el.dataset.Path;
      if (Path) {
          var xhttp = new XMLHttpRequest();
      xhttp.onreadystatechange = function () {
              if (this.readyState == 4 && this.status == 200) {
            el.outerHTML = this.responseText;
              }
          };
          xhttp.open('GET', Path, true);
            xhttp.send();
        }
    });
});






