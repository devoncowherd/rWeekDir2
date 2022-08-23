# Notes W5D2

### Servelets

- What?
    - Used to create dynamic web applications which reside on a server
    - Servlet technology is robust and scalable because of java
        - before servelet CGI (common gateway interface) scripting language which as commoas a server side programming language
    - There are menu interface and classes in servlet, genericServlet, HttpServelet, etc
    - Servelets are used to create web applications
    - Servlets are a web device that provides many interfaces and classes
    - You must implmenet the `Servlet` interface
- Advantages
    - There are many advantages to Servlet over CGI, the web container creates a thread for handling multiple request to the servlet.
    - This thread is much more lightweight than processes
- GFG
    - Servlets use server-side processing
    - Flow:
        - Client request
        - Server receives request
        - server passes request to corresponding servelet
        - servlet processes the request and returns output of result
        - servlet sends response back to webserver
        - webserver sends response back client browser

- Web Terminology
    - Get = retrieve information
    - Post = create, insert, send
    - Put = update
    - Delete = removes

- Servlet API
    - `java.servlet` and `java.servlet.http` packages
        - `java.servlet` contanis main interfaces and classes that are used by the servlet
        - `javax.servlet.http` contains interface and classes for http requests

- Servlet package classes
    - `Servlet`
    - `ServletRequest`
    - `ServletConfig`
    - `RequestDispatcher`
- GenericServlet
- ServletInputStream

- Servlet Interface
    - Provides common behavior all servlets need
    - Needs to be implements before creating a servlet

- Lifecycle methods
    - `init()`
        - initializes the servlet
        - this should only be invoked once
    - `service()`
        - provides a response to the incoming request
        - Invoke this at each container request
    - `destroy()`
        - it is only invoked once to indicate the servlet is being destroyed


- Non-lifecycle methods
    - `getServletConfig()`
    - `getServletInfo()`

```java
public class ExampleServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("This is the get method");
        PrintWriter out = response.getWriter();
        //...
    }
}
```