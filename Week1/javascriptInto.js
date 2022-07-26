//global scope
var a = "Hello World";

function firstFunction() {
    var b = 'AYAYA';
    let c = "Goodbye World";
    console.log(b);
    if(c == "Goodbye World") {
        c = "So long world..."
    }
    console.log(c);
    
}

//will cause an error due to b existing inside function scope
firstFunction();
console.log(a);

let stringVar = `24`;
let numVar1 = 1;
let numVar2 = 2;
let numVar3 = 24;

console.log(stringVar + numVar1);
console.log(stringVar * numVar2);
console.log(stringVar == numVar3);