
---

# Notes D5W1

### Review - Which is a bit hazy?

- `[css]` Rulesets! **Selector**...That's the name of the what's being selected! and **Declarations** are the key value pairs that change the properties
- `[css]` Ruleset precedence **id > class > tags > order**
- `[html]` Box Model = Margin, Border, Padding, Content
- `[css]` Sizing? Absolute (%) and Relative (px)
- `[js]` Primitive types: Numbers, Null, Boolean, String, Undefined, BigInt, Symbol
- `[js]` var, let, const = 3 types to declare these since JS is loosely typed


### Github

- Github is a cloud-based repository hosting service

### Git

- Git is a version control tracking program/system

### Ways to Start

- Forking
    - Fork on website
- Cloning
    - Copy link
- Initialize a locally created project
    - git init
        - creates a .git directory in our root folder which stores commits, url of any connected remote repos, current code base, codebase history, and so on
    
### Terms

- Working Directory
    - Contains files that git is currently tracking and files that have been modified since the last commit to the local repository
- Staging Area
    - Contains the files that we've staged
- Local Repository
    - Contains files as they were in the most recently made commit

### Staging

- `git add .` adds everything you've done thus far
- `git commit -m "some message"` commits the changes locally

### Pushing Changed

- `git push` once we've committed locally, use this to push to cloud

### Git branching

- `git init` creates the initial master/main branch locally
    - should only hold code that is in production or ready to be in production
- Branches are like timelines that get updateded with each commit
- New branches = takes snapshot of branch we're branching from, and then we can develop new features without affecting the initial branch (or source of truth)

### Fetching

- fit `fetch` command downloads changes from remote repo, but doesn't commit them to local repo

```js 
// This challenge is a little bit more complex
// Write a function that takes a number (a) as argument
// If a is prime, return a
// If not, return the next higher prime number
function myFunction(a) {

    let isPrime = true;

    if(a == 2) {
        return a;
    }

    if( a== 3) {
        return a;
    }

    for(let i = 2; i < a; i++) {
        if(a % i == 0){
            isPrime = false;   
            break;
        }   
    }

    if(isPrime) {
    return a;
    }

    if(isPrime = false) {
    
    }
}
```