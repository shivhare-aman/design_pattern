
		
		Bridge Pattern
		
- The Bridge design pattern allows you to separate the abstraction from the implementation. It is a structural design pattern. 

There are 2 parts in Bridge design pattern : 

Abstraction
Implementation

This is a design mechanism that encapsulates an implementation class inside of an interface class.

In our project what we did is we created 2 interfaces 'RemoteController' and 'AdvancedRemoteController' and created a common interface 'Device'.

So this device interface will handle all the devices we need to work with. And this AdvancedRemoteController is inheriting the RemoteController interface so if we add any implementation of AdvancedRemoteController then we have to handle the RemoteController as well.

Now when we register any device with device interface then we handle the methods of it and hence creating a bridge to handle both the interfaces.
