

	Command Design Pattern


- The Command Design Pattern is a behavioral design pattern that turns a request into a stand-alone object, allowing parameterization of clients with different requests, queuing of requests, and 	support for undoable operations.

Here in this project you will see a folder 'fx' which is basically storing the files which will basically handle the requests.

And we have 2 more classes 'AddCustomerCommand' and 'CustomerService'.

The aim basically is to provide implementation of the command in a way that multiple devices can use the same interface and provide its implementation.
So what we did  here is that we created a class which will basically decide which implementation will be used and that is 'AddCustomerCommand'.

This is the class which will deligate the work to the passed instance. So if we have passed a instance of 'CustomerService' then we will be directed to the 'CustomerService' implementation and vice-versa.
