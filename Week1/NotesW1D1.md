
---

# HTML

- Hypertext Markup Language
- Markup language for creating webpages and applications
- Browsers parse HTML to render the content of a webpage when we visit it
- Elements in HTML define the structure of the document and are indicated by tags
    - The element consists of everything between the start of the opening tag and the end of the closing tag
    - The tags for elements are surrounded by angle brackets
    Closing tags start with angle bracket

```html
<div></div>
```

- Attributes
    - Key/value pairs metadata
    - Some html elements have their own unique attributes, but there are also global attributes that all elements can use such as `class` or `id`

### Class

- Clases are used to group  elements that should have a common appearance
- We assign elements for styling
- Elements can have multiple classes

### ID

- ID is for styling that is unique
- Use the `id` with only unique values

### HTML Docs

- Each document begins with a special tag 

```html
<!DOCTYPE HTML>
```

- Following the DOCTYPE declaration, we have the html tag as the root of our doc

```html
<html></html>
```

- Then..

```html
<head></head>
<body></body>
```

### Head Element

- Contains the metadata of the overall page
    - `<title></title>` = page name
    - `<meta></meta>` = hold name, author, desc, etc.
    - `<link></link>` = hold relative path
    - `<script></script>` = contains internal JS 
    - `<base></base>` allows us to set a base url


### Body Element

- Include visible elements of the HTML doc
- They can be either inline or block
    - Block elements have implicit new lines, so they take the entire width of the page
        - e.g `<div></div>`
    - Inline elements render within the line while taking only the space they need
        -e.g. `<span></span>`

### Common HTML Elements

[HTML ELEMENTS](https://www.w3schools.com/default.asp)

-  `<a></a>` linking
    - `href="#"` hold the link
    - `target=""` specifies how to open the link
- `<img></img>` images
    - `src` specifies the link or local source
    - `alt` handles if the first doesn't render
- `<table></table>` tables
    - `<thead></thead>` element that defines the table
- `<ol></ol>` renders an ordered list    
    `<li></li>` each element
- `<ul></ul>` unordered list
    `<li></li>` each element
- `<p></p>` paragraph element
- `<span></span>` only spans the element length
- `<b></b>` bolding
- `<i></i>` italicizes text
- `<h{}></h{}>` header tags to h1-h6 scale
- `<br>` breaks the line (self-closing)
- `<!--Comment-->`

### Semantic Markup

- Some html tags have semantics 
    - gives description of content in the tag
- `<h1></h1>` The browser interprets this as the most important header on the page
- This is necessary for SEO (Search Engine Optimization)
- Important for screen readers!
- examples: 
    - `<header></header>`
    - `<nav></nav>`
    - `<section></section>`
    - `<article></article>`
    - `<aside></aside>`
    - `<footer></footer`

### Forms

- `<form></form>`Forms are sections of our html docs that contain controls that solicit information from a user
- Forms will use `<input></input>`
- `type` within the block declares the type of input
    - text gives a text input  box
    - password grants a field to hide passwords
    - radio renders a set of radio buttons
    - checkbox renders a checkbox for the user
    - file 
- `<label></label>` is used to label the input box
- `<textarea></textarea>` element in form
- `<select></select>` dropdown
    - `<option></option>` element in dropdown

- `<input>`
    - `type = submit` = submit button
    - `type = text` = text input field
    - `type = password` = password input field
    - `placeholder` = default value
    - `min`, `max`
    - `required` requires user to provide a valie
        - Boolean value
        

### HTML Form Validations

- What? Whenever a user attemps to input information into the fields, the form will be checked for legitimate submission information `action`
    - Client-side JS
    - Validation based on HTML 5 rules 
    - Imposed constraints such as minLength maxLength
    - Gathered from `<input></input>`


---


# CSS

- Cascading style sheet
- used to style our html pages
- loads and parses html to create the DOM (Document Object Model)
    - the browser will laod and parse the css to style the appropriate nodes
    - once this is completed, the browser will display the content
    - Rulsets are a collection of selectors and properties
    - properties determine the kind of styling that we're applying
    - values given to property

- Syntax 
    ```css
    body {
        background-color:whitesmoke;
    }
    ```

    - We can include CSS inline internally in our html page or externally in a stylesheet
    - We can also use a style in the page head
    - inline use `style=""`
    - include propery value pairs

```css
<div style="background-color:tomato">
```

### CSS Specificity 

- A single element may match different rulesets
- Any elementwith inline styling will have declarations
- To determine precedence between internal and external rulesets we calculate to specify as follows through a three-column calculations
    - The first column is the number of `id` values in the selector
    - the third column is the number of tag selectors
- specificity score is calculated, it's evaluated from left to right

### Box Model

- The Box model is the container that wraps around each HTML element in our page
- It consists of four layers: (outermost to innermost) margin, border,  padding, and the content
- Padding is spacing between the border and the content
- The margin consists of spacing between the element and other elements

```html
<p align="center"><img src="./box_model.jpg"></p>
```
- Styling margins
    - `margin`,`margin-bottom`,`margin-top`,`margin-left`, and `margin-left`;
    - `margin` is a shorthand property
    - can be adjusted using `em` percentages for ease
    - If we use an absolute size, we can use `px`,`cm`, and `in`
    - `shorthand`
    - top, left, right precendence

### Styling Borders

- Border properties include `border`, `border-bottom`, `border-left`, `border-right`, and `border-color`;
- `border` = can have shorthand properties too
    - `dotted`, `solid`, `dashed`
    - takes color names such as `black`, `blue`, `green`;
- property(width,style,code) - > each side holds these

### Styling Padding

- We specify padding through one or more of the padding sides
- `padding` encompasses
    `padding-right`
    `padding-bottom`
    `padding-top`
    `padding-left`
- Each of these properties functions analogously to the corresponding margin property and takes width value

### Responsive Web Design

- Design Pattern to make Designs Responsive (device independent quality)
- How?
    - `viewport`
        - viewport is html 5 to get device width
    - `<picture>` for images
    - `<source>` for elements that have media

### Flexbox

- responsive container for holding html elements
- sets the display property for an element to `flex`
- `flex-direction` -> determines how our elements are rendered
    - `row` / `row-reverse`