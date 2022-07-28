
---

# ES6+ Features in JS - The JS Standard

- ECMAScript is a specification for a scripting language
- JS is the most prominent example of a scripting language that adheres to ECMA script
- Whenever ECMA is updated, JS Will adopt the new features
- 6 Years = Major Release
    - ES5 was released in 2009 originally - the major release
    - ES6 2015
    - ES6 releases made annualy
    - ES6 Updates is also referred to as ES 2015 since the release was so major
        - `let` and `const`
        - `for-of` loop which allows us to iterate through an iterable object
        - classes
        - promises
        - `${}` template literals
        - default parameters functions
        - `async` `await`
        - rest and spread syntax

---

### Template Literal

```js
let a = "MyString";
console.log("This is ${a}");
```

### Default Parameters

```js
function myFunc(a,b,c="default") {

}

//the default value will be used in this invocation since the 3rd argument is not entered
myFunc(1,2);
```

### Spread Syntax

- Spread syntax indicated by ellipses in the arguments passed to a function
    - expands an iterable object
    - allows us to pass an array

```js
function add(a,b) {
    return a + b;
}

let myArr = [3,4];

add(...myArr);
```

- We can also use spread syntax to object literals to add the contents of an array or object

```js
let myArr = [3,4];

let myArrTwo = [...myArr,5,6];

console.log(myArrTwo);
```

- Rest parameters are 3 ellipses before a parameter `...`
    - Any arguments passed after the ellipses will be stored as an array

```js
function add(a,b,...c) {

    let sum = a + b;
    for(let i = 0; i < c.length; i++){
        sum += c[i];
    }
    return sum
}
```

### Object and Array Destructuring

- A syntax that allows the expansion of values from objects and arrays into different parametes

- Array destructuring

```js
let myArr = [1,2,3];

// will assign 1 to a, 2 to b, and 3 to c;
let [a,b,c] = myArr;
```

- Object Destructuring

```js
let myObject = { 
    myKey : 'my value',
    myOtherKey : 'my other value'
}

let {myKey , myOtherValue} = myObject;


let {myKey : myOneKey, myOtherKey} = myObject;
```

### For-Of Loop

- When we introduced control flow statement in JS, we discussed the regular for loop
    - e.g.

```js
for(let i = 0; i <5; i++) {

}
```

- We have other loops!
- `for-in`

```js
for(let key in objecToIterateThrough) {
///do some stuff to or with it
}
```

- `for-of`

```js
for(let iterableValue of iterableObject){
    ///do stuff to/with contents of iterableObject
}
```

### Inheritance and Classes

- All objects in JS inherit from the `Object` class
- We can establish inheritance between objects through the use of the prototype property
- Wiuth prototypical inheritance, an object references another object through its hidden Prototype property
    - if non-existent, property is read from the original object or a nonexistent method is called, the **object prototype** will be checked to see if the property / method exists there

 ```js
 let Animal = {
    eat : function() {
        console.log("eat");
    }
 }

//since the dog object doesn't have that method, it will check the prototype, which is animal, and it has that method
 let dog = {}
 dog.__proto__ = Animal;
 console.log(dog.eat())
 ```

 - Prior to ES6, prototypical inheritance was most common
    - ES6 first introduced classes to JS
    - ENTER OOP!
- To declare a class in JS, use the `class` keyword followed by the name of the class && `{}` which is the class body
    - use Pascal case
    - Assign them to variables
```js
class Animal {
    constructor(nameOfAnimal){
        this.nameOfAnimal = nameOfAnimal;
    }

    eat() {
        console.log("Eat");
    }
}


let dog = new Animal("Dog");
dog.eat();
console.log(dog.nameOfAnimal());
```

### Extending Classes

- One class in JS can inherit another by using the `extends` keyword followed by the ane of the class in the pascal-case classed name declaration

```js
class ChildClass extends ParentClass{}
```
- We can inherit at-most one class using `extends`
- Constructors in children classes must call the constructor of the parent class
- `super` keyword
    - must be used before we can use `this` context
- `proto` vs `extends`
    - Use `extends` to establish inheritance between two classes
    - Use `proto` between objects (much more narrow)

- Functions that are anonymous will be executed immediately
- Lambda functions are like other functions, but they are also anonymous

### Function Closers

- Nested anonymous functions

```js
function outerFunction() {
    string a = "ayaya";
    return function() {
        console.log(a);
    }
}
```


### Promises

- A promise is a proxy for a value that isn't currently available
- It starts in a `pending` state and the calling function continues execution
- Then promise will eventually move to either a `resolved` or `rejected` state
- We can create our own promises by calling the promise constructor

```js
let myPromise = new Promise((resolve, reject) => {

});
```

- The promise construtor takes a function as its parameter
    - The function is referred to as the executor function 
- `resolved`
    - we use the resovled parameter
- `rejected`
    - we use the rejected parameter
- When we instantiate a new promise, the executor function runs automatically
- The promise constructor returns an object `state` and `result` properties
    - `state` is `pending` initially and becomees `fulfilled`
    