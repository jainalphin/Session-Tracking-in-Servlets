# Session-Tracking-in-Servlets
There are four techniques used in Session tracking:

  1.  Cookies
  2. URL Rewriting
  3. HttpSession
  
## Cookies in Servlet
A cookie is a small piece of information that is persisted between the multiple client requests.

## URL Rewriting
In URL rewriting, I append a token or identifier to the URL of the next Servlet or the next resource.

## HttpSession interface
In this application, container creates a session id for each user.The container uses this id to identify the particular user.An object of HttpSession can be used to perform two tasks:
1. bind objects
2. view and manipulate information about a session, such as the session identifier, creation time, and last accessed time
