//to change hello in html in javascript to hello world
var heading=document.getElementById('h2');
var an=document.getElementById('a').innerHTML="anchor tag";
heading.onclick=function(){
  heading.innerHTML="hello world";
}