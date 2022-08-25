# Notes W5D3

### Servlets Continued

- interface
    - `init()`
    - `service()`
    - `destroy()`
    - `getServletConfig()`
    - `getServletInfo()`

- Session Tracking
    - sessions are intervals of time
    - by default, sessions are stateless
        - stateless means we have not explicitly tracked the session interval
    - it is also known as session management in the servelet

- How?
    - Cookies
        - Cookies are named
        - Cookies can add responses from servers
        - Cookies are stored in browser cache
        - Cookies are added to requests by default
        - Note: This is often how users are recognized
        - Types:
            - non-persistent = single session
            - persistent = one or more sessions
        - Advantages:
            - client-side
            - simple technique of maintaining state
        - Disadvantages:
            - Users may disable cookies
            - Only textual information may be sent
        - Methods:
            -  `addCookie()`
            -  `getCookie()`
    - Hidden Form Field
        - invisible fields used for maintaining the state of the user
        - extremely vulnerable to knowledgeable users
    - URL Rewriting
    - HTTP Session
    - SendRedirect
        - This will redirect the response
        -  `sendRedirect()`

    - Forward     
        - `forward()`

- URL rewriting
    - append a url of the next servlet for key/value pairs
    - url limit = 1044 characters
    - Advantages
        - it will always work with or without cookies
            - privacy concerns
        - extra form submission is not required
    - Disadvantages
        - it will only work with link
        - it can send only textual information
        - data will be visible in the browser
