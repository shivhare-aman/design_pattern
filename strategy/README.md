
	
	Strategy Pattern
	
- A strategy pattern is a behavioral design pattern that allows the behavior of an object to be selected at runtime. It is one of the Gang of Four (GoF) design patterns, which are widely used in object-oriented programming. In simpler terms, The Strategy Pattern allows you to define a family of algorithms, encapsulate each one of them, and make them interchangeable. This pattern lets the algorithm vary independently from clients that use it.

In our project we handled the work of Compression and Filter seperately.

So we created two interfaces Compressor and Filter and handled the working from ImageStorage class.

In ImageStorage we instantiate both of the objects and deligate the work to the respective filters.
