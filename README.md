# bootique-shiro-demo

Simple [Bootique](http://bootique.io) app demonstrating the Bootique Shiro Module with Jersey.

# Prerequisites
* Java 1.8 or newer.
* Apache Maven.

# Build the demo

```bash
git clone https://github.com/bootique-examples/bootique-shiro-demo.git
cd bootique-shiro-demo
mvn package
```
Enter the following to launch the app in Maven.

```bash
java -jar target/bootique-mvc-demo-1.0-SNAPSHOT.jar
```

After launching the app, go to

1. `http://localhost:9999/login.jsp` check for permissions to have role 'admin', if have no permissions will redirect to `/denied` page, otherwise to public page
2. `http://localhost:9999/pub` get public page returns hello
3. `http://localhost:9999/login?username=username&password=password` log in the user with specified username and password.
    There is two users:
    * user/password - has role 'user'
    * adminuser/password - has role 'admin'
    After succes login you will be redirected to '/login.jsp' page. If you will specify wrong credentials you will see the 404 error.
4.  `http://localhost:9999/logout` logges out. After logout you will see 'Logged out' message.
5.  `http://localhost:9999/private` endpoint with configured  permissions in `bootique.yml` file. 
If you logged in with 'admin' role you will see 'admin' message otherwise you will be redirected to `/login.jsp`


