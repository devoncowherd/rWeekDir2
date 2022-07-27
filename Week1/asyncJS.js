function timeoutFunctionOne() {
    console.log("Time's up!");
}

function timeoutFunctionTwo() {
    console.log("Time's up again!");
}

setTimeout(timeoutFunctionOne, 1000);
setTimeout(timeoutFunctionTwo,5000);

//takes an arrow function with no parameter
//repeatedly invokes the same function
let toEscape = setInterval(() => {
    console.log(`This is a set interval! It will be invoked repeatedly for the specified interval");
    alert("Invoked at ${Date.now()}`);
}, 1500)

setTimeout(() => {
    clearInterval(toEscape);
}, 5000);