---

# Notes

* We can use the "!important" modifier to force the browser to load a particular style despite default precedence 
* Thin, medium , or thick for borders which gives relative border sizes

---

### Javascript

- Javascript is an interpreted language that our browsers can parse and execute
- Javascript is the main scripting language of the web
    - it was originally developed to add client-side functionality to webpages
    - There have since been frameworks made such as Node.js that allow execution outside of the browser
- Javascript is a single-threaded language, meaning that the Javascript engines that interpret and run ouir code can only execute one process at a time
- It's loosely typed and dynamicallyp-typed language
    - We don't declare the types of our ariables when declaring our variables
    - The type of a Javascript variable isn't determiend until runtime and the variuables can chance throughout the execution of our program

>* Typescript makes JS statically typed

### Javascript Primitive Data Types

- Primitive data types are is a value that isn't an object
    - `string`
    - numbers
        - `int`,`double`,`float`; 
    - boolean
        - `true`,`false`;
    - undefined
        - A value that's explicitly assigned to a variable to indicate that the variable doesn't have a value
    - symbol
    - null
    - bigint

### Variable Declarations

- We don't delcare data types in JS. Use:
    - `var`
        - enforces global or function scope depending on where it's declared 
            - inside function = function scope
            - outside  = global scope
    - `let`
        - enforces block scope
    - `const`
        - enforced block scope but given to constant values

> * use `const` or `let`
- The element will be **hoisted** if it is within the same scope, but the value cannot be returned
- `let` and `const` are not hoisted, so will get a reference error if they are called before they are declared

### Type Coercion 

- Converts the type implicitly
    - Numeric coercion 
        - JS Engine converts on the fly

| Value | Becomes |
| ----- | ------- |
| `undefined` | `NaN` |
| `null` | 0 |
| `true` | 1 |
| `false` | 0 |
| string | whitespaces from the start and end of the string are removed. If the remaining string is empty, the converted value is 0. If the string can be converted to a number (meaning it only has digits), it will be converted to a number.|

---

### JS Operators

- Common JS Op[erated listed by precedence
    - `()`
        - used for grouping
    - `++`, `--`, `-`, `+`
        - `++` && `--` are the decrement/incrementers 
        - `-`,`+` are the unary negation and addition operators
    - `*`,`/`,`%`
        - `&` && `/` are the multiplication/division operators
        - `%` modulo operator
    - `+`,  `-`
    - `<`,`>`,`<=`,`>=`
        - comparison operators
    - `=`
        - assignment
    - `==`, `===`
        - equality and strict equality
    - `&&`, `||`
        - AND and OR

### Control Flow

- control flow allows us to change our execution path by and repeating or skipping lines of code
- conditionals
    - `if()`
    - `else`
    - `else if()`   
- ternary operators
    - someExpression `?` ifTrue `:` ifFalse
- Switch
    - `switch(`someExpression`)`
    - `case` aCase`:`
    - `break;`
        - if not included in a case, it will execute the following code block(s)
    - `default:`
    - Use this when you're comparing the same expression to many different values
- Loops
    - Same as other langs

### Arrays

- Zero-indexed collections of comma-seperated values
- The values within an array can hae different data types
- To retrieve a value from the array, we use square brackets and pass the index of the element
- arrays in JS are dynamically scaled
- `length` property returns the number of elements
- It has common array methods

| Method | Explanation |
| -----  | ----------- |
| `shift()` | Removes the first eleement of the array and returns it|
| `unshift()` | Adds the given value to the beginning of the array |
| `push()` | Adds the given element to the end of the array | 
| `forEach()`| iterates across each element of the array |
| `map()` | creates a new array with adjusted values if they are adjusted |
| `reduce()` | Iterates through the entire array and outputs the value as determined by the user expression |

## Objects

- Objects in JS are collections of key-value pairs, where the key and value are separated by a colon
- We declare objects through an object literal with curly braces surrounded the key-value pairs

```js
let myObject ={
    keyOne : 1,
    keyTwo : 2
}
```

- We can access the value associated with it by using `.` notation

### Truthy/ Falsy Values

- Falsy values are those that evaluate to false in a conditional expression or convert to false when ued in a Boolean expression
- Falsy values in JS
    - 0
    - undefined
    - null
    - false
    - NaN
    - empty string (`''`, `""`)
- We can use truthy, so it will evaluate to `true` in a conditional expression
- Why? Falsy are used if we want toe nsrue that we're working with an object that has been initialized before we refer to a property of that object we can perform a **null check**

```js
if(myObject) {

}
```

- We can also perfor this check through th enull chaining operator (`?.`) when we're referring to an object's key
    - e.g. `myObject?.keyOne`
    - if the value before the question mark