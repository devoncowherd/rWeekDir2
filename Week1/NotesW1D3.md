
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

### The Event Object

- All events in JS inherit from the event object
    - They inherit common properties from it
    - Lets you manipulate propogation of events
        - Bubbling = from inside first element
        - Capturing = opposite bubbling
        - `stopPropogation()` and `stopImmediatePropogation()`
            - If there are event listeners on elements that haven't fired yet, they won't be invoked (traversal is stopped)
            - `stopPropogation()` = stop subsequent events /`stopImmediatePropogation()` = stop current event
        - `cancelBubble()`
            - Boolean property that determines if the bubbling phase occurs for an event


### SDLC (Software Development Lifecycle)

1. Requirements Gathering
2. Analyzing Requirements
3. Design
4. Development
    - Develop the product
5. Testing
    - Unit Testing
6. User Acceptance Testing (UAT)
    - End-client tests the product
7. Release
8. Maintenence

### Waterfall Methodology

- In Waterfall, we follow SDLC in order

    - Benefits
        - We don't backtrack on steps
        - Waterfall doesn't require procedures like Scrum
        - Strong idea of product from start to end
    - Drawbacks
        - Waterfall doesn't have much client interaction, so the end product may not be ultimately what the client wants
        - It's difficult to make changes in a waterfall environment since the goal is to be rigid/ change-resistent / avoid returning to lifecycle steps
        - When following waterfall, no official testing is done until development is finished which makes it more difficult to improve the codebase compared to other methodologies
    
### Agile 
    
    - More flexible compare (Waterfall)=> with the goal of adapting to changing requirements && future requests from the client
    - MVP 
        - incremental releases 
        - release boundaries
    - Benefits
        - More adaptable
            - Features can be adjusted
            - Many releases
        - Easier to Debug
        - Smaller Codebase
    - Negatives
        - Felxibility can lead to bad practices if we're not disciplined
        - Agile's flexibility can lead to a lack of predictability
        - Can reduce commitment of the development team
        - Following agile practices requires knowledge of frameworks

### Scrum Framework

- Scrum is a framework of the agile methodology that includes certain ceremonies
    - Standups
    - Retrospectives 
    - Sprints
        - Each Sprint will finish with a release
    - Master and Owner
        - The master directs the team
        - The owner has the greatest stock in the product and guides the master. The owner also communicates with the client

### Scrum Process

- Before the sprint begins, the team moves requirements from the project backlog to the spring backlog
- Throughout the sprint, the scurm master will lead 15 minute daily standups
    - Accomplished?
    - What to do today?
    - Hangups?
    - Opportunity to check in with peers
- Retrospective
    - Reflect on tasks
    - Review unfinished tasks
    - What went well?

- Benefits
    - Daily standups quickly find hangups
    - Incorporates client
    - Allow for more releases
- Drawbacks
    - Introduce uncertainty
    - Deadline may be too fluid
    - May end up increasing cost for final release date
    - Feature Creep
    - Continuous addition of product features that keep the project going for an unreasonable amount of time
    - Relies on team commitment
        - Teammates may not vocalize roadblocks

### Kanban Framework

    - An Agile framework that uses a kanban board
    - Backlog, Design, Development, Testing, Release
    - Teammates can refer to kanban for new and completed cards
    - Kanban easily lends itself to specialization

    - Benefits 
        - Simplicity
    
    - Negatives
        - Requires Team member commitment
        - Team members may accidentally take on twice the work
        - Feature Creep
        - Missing Deadlines

### Scrumban Framework

- An agile framework that combines scrum and kanban
- Pairs visuals with sprint ceremonies
- Allows devs to have a better idea of the prihect and sprint progress through the kanban board

### Extreme Programming (XP)

- An agile framework with a variety of practices to ensure that devs are adhering to its values anad communication, simplicity, courage, and respect, and feedback
- XP seeks to go beyond improving product qualtiy by also improving team cohesion and the lives of team members
- It includes practices such as weekly cycles
- In incremental design, we offer a general high-level design of the product initially and leaves specifics for later
- TDD
    - Design such that tests must pass befoire writing the code itself
- 2 devs
- Two minds can usually solve an issue better
- Includes a member of the client to receive faster feedback

- Drawbacks
    - Information overload with procedures
    - Team must be extremely dedicated to practices
    - client member may unknowningly stifle development
    - best-practices may be scrapped due to shorter deadlines
    - documentation may rapidly become outdated

### Sprints

- Epics: Set of related features
- Stories: Epics broken down into multiple stories (individual features)
    - format : when f(g(x))
- Stort Points:
    - A level of difficulty assigned to each
    - 
- Velocity: 
    - Is the sum of story points of all user stories completed during a sprint
    - Helps accurately gauge future sprint
- Burndown Charts: 
    - Graphical representations of sprint progress
    - y = remaining
    - x = days+back