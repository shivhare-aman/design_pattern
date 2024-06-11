Decorator Pattern

Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.

In this project you will see an example of decorator pattern.

So suppose we fall in a situation where we need to do multiple operations one by one on some data and the order of those operations can be changed. And the requirement is that we should code it in such a way that if we change the order
then we should not change the code for it. The code should be generic enough to handle this kind of scenario.

Like here we have a plain text that we need to store on cloud.
Suppose the text is credit card number, now storing raw number/string is not a good practice for very obvious reasons, so what we are doing here is we are first
compressing the data then encrypting the compressed data and then storing to the cloud.

In the project you will see the implementation of the explanation provided above and if you change the order from

- Raw data --> Compression --> Encryption

to 

- Raw data --> Encryption --> Compression

then also you will see that you just need to replace the method calls in the main class and that's it. No more change is required..
