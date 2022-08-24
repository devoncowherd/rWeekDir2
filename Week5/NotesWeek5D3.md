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
    - URL Rewriting
    - HTTP Session

    - SendRedirect
        - This will redirect the response
        -  `sendRedirect()`
        - `forward()`

