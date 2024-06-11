Chain of Responsibility Pattern

The Chain of Responsibility design pattern is a behavioral design pattern that allows an object to pass a request along 
a chain of handlers. Each handler in the chain decides either to process the request or to pass it along the chain to 
the next handler.

In this project you will see an example of a problem being solved by chain of responsibility pattern.

So the assumptions being made here in this application are :

	--> We need to authenticate the request first the moments it comes to the application,
		-> if the authentication is successfull then
	--> We need to log the request data,
		-> if things seems fine here also.. then
	--> We need to compress the data and then we will pass it to the endpoint of the applicaiton.
	

So basically this pattern focuses on the way in which we can handle the pre-processing of the data before the request 
is being sent to the endpoint.

