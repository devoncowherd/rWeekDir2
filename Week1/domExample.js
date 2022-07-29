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

// Write a function that takes two strings (a and b) as arguments
// Beginning at the end of 'a', insert 'b' after every 3rd character of 'a'
// Return the resulting string
function addElementToString (a, b)
{
    let x = a.length;
    let holder = ""
    while(x > 3) {
        x = x - 3;
        a = a.slice(0,x) + b + a.slice(x, a.length)
    }
    return a;
}


addElementToString('1234567','.');

function nextAlpha(str) {
    console.log(Array.from(str).map(x => {
        switch(x) {
            case "a":
                return "b";
            case "b":
                return "c";
            case "c":
                return "d";
            case "d":
                return "e";
            case "e":
                return "f";
            case "f":
                return "g";
            case "g":
                return "h";
            case "h":
                return "i";
            case "i":
                return "j";
            case "j":
                return "k";
            case "k":
                return "l";
            case "l":
                return "m";
            case "m":
                return "n";
            case "n":
                return "o";
            case "o":
                return "p";
            case "p":
                return "q";
            case "q":
                return "r";
            case "r":
                return "s";
            case "s":
                return "t";
            case "t":
                return "u";
            case "u":
                return "v";
            case "v":
                return "w";
            case "w":
                return "x";
            case "x":
                return "y";
            case "y":
                return "z";
            case "z":
                return "a";
        }
    }).join(""))
}

nextAlpha('bnchmf');

//much better.. REVIEW**
function myFunction(str) {
    const arr = [...str];
    const correctedArray = arr.map(e => String.fromCharCode(e.charCodeAt()+1));
    return correctedArray.join('');
  }

// This challenge is a little bit more complex
// Write a function that takes a number (a) as argument
// If a is prime, return a
// If not, return the next higher prime number

function returnPrime(a) {

    let next = 0;
    let prev = 0;

    for(let x = 0; x <= 2000; x++){
        next = x * 6 + 1;
        if(a == 2 || a == 3 || a == ((6 * x) + 1) || a == ((6 * x) -1) && a % 2 != 0 && a%3 != 0) {
            return a;
        } else if(a >= prev && a <= next) {
            return x * 6 + 1
        }
        prev = next;
    }
}