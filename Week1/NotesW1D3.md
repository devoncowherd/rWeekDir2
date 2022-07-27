
---

# Notes W1D3

### Synchronous JS

- Typically, our code runs synchronously, but with web applications, a great deal of the interactions must be synchronous
- The code is executed linearly based upon flow control
- Intensive operations can cause app-hang, lag, and other problems
- This is not ideal for web applications
- What will we use instead? ASYNC!

### Microtask Queue

- An internal queue used by JS engines (same as browser)
- The queue is FirstInFirstOut - All jobs must be queued before executions
- The engine only takes tasks from microtask

### Event Loop

- The event loop is where tasks that are pulled are executed
- Once the task has finished, JS will grab the next task
- Only when the microtask queue is empty will the engine turn to other tasks such as rerendering the page for the user with any updates

### Callback Function

- A Callback function is a function that's passed as an argument to another function and is executed when the first function returns
- Callback functions are used with asynchronous execution in JS to tell the engine what to do when the asynchronous action has finished and returned

### setTimeout()

- takes two parameters
- the time that must elapse before the callback function is executed in millisections
- will invoke the callback function after the specified amount of time has elapsed

### setInterval()

- takes two parameters
    - a callback to execute at regular intervals after the specified time has elapsed
    - the time must elapse before the func is executed

- will invoke callback function passed as first argumentevery internal period
    - won't invoke callback period

### Document Object Model (DOM)

- The document object model is the W3C standard for accessing documents from JS code
- in the HTML DOM, the document is the html page we interact with
- The root of the DOM tree for a particular page is the document
- The windows object represents the browser and contains the entire document

<p style="align:center"><img src="../images/dommerino.png"></p>

### Event Object