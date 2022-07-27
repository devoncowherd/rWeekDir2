//You can load functions with the window

window.onload = ayaya();

function ayaya(){
    console.log("Ayaya!");
}

//1. Create a new paragraph
//2. Change the innerhtml of one

//Page Elements
let para1 = document.querySelector(".para1");
let main = document.querySelector(".main");
let body = document.querySelector("body");

//Change Text
para1.innerHTML = "Different text!"

//Append Child
let para3 = document.createElement("P");
para3.innerHTML = "This 3rd paragraph was created via JS!"
para3.setAttribute("align", "right");
main.appendChild(para3)


//change attributes
para1.setAttribute("align", "center");
//getAttribute returns the attribute setting

let divElement = document.querySelector("div");
divElement.addEventListener('click', ()=> {
    alert("You clicked the dern div!");
});
