let userInput = 0;
let submitButton = document.getElementById("userSubmit");
let output = document.getElementById("output");

submitButton.addEventListener("click", ()=> {
    userInput = document.getElementById('inputBox').value;
    console.log(userInput);
    output.innerHTML = checkFizzBuzz(userInput)
})

function checkFizzBuzz(num) {
    if(num% 3 == 0 && num%5 == 0){
        console.log("fizzbuzz");
        return "<span style='color:aqua'>Fizz</span><span style='color:limegreen'>Buzz</span>";
    } else if(num % 3 == 0) {
        console.log("fizz");
        return "<span style='color:aqua'>Fizz</span>";
    } else if(num % 5 == 0){
        console.log("buzz");
        return "<span style='color:limegreen'>Buzz</span>";
    } else {
        console.log("Not fizz or buzz!");
        return "Not Fizz or Buzz"
    }
}

checkFizzBuzz(15);