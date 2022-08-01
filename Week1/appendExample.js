// only change below
let wrapper = document.createElement("div");
wrapper.setAttribute("id", "wrapper");
let parent = document.getElementById("button").parentNode;
wrapper.append(document.getElementById("button"));
parent.append(wrapper);

//only change above
// expects button to be child of element with id 'wrapper'
// const btn = document.querySelector('#wrapper button');

// if(btn) {
//   const handleClick = () => {
//     btn.innerText = 'Thank you! ❤️'
//   }
//   btn.addEventListener('click', handleClick)
// }

const button = document.getElementById('button');
button.addEventListener('click' , () => {
    // type in your code here
    if(document.getElementById("input").value != ""){
    let li = document.createElement("li");
    li.textContent = document.getElementById("input").value;
    document.getElementById("list").append(li)
    }
});

function myFunction(a, n) {
    let newArr = [a[0]]
    let iterator = 0;
    while(iterator <= a.length - n){
        iterator += n;
        newArr.push(a[iterator]);
    }
    console.log(newArr);
}

myFunction([1,2,3,4,5,6,7,8,9,10],3)