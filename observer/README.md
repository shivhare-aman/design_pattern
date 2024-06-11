                                                       **Observer Design Pattern**


This is an implementation of a design pattern called Observer, below is the basic definition of what this pattern is.

The Observer Design Pattern is a behavioral design pattern that defines a one-to-many dependency between objects so that when one object 
(the subject) changes state, all its dependents (observers) are notified and updated automatically.

So inside this repository you will find 4 different folders, and here is the info about them.

1) **observer**: This consists of basic implementation of what the pattern is and how it works.

The enhancement to the above pattern is the stratergy by which we pass the data inside the classes, and that is possible in 2 fashions
Push and Pull stratergy.

2) **observer_pull**:  This showcase the pull stratergy with which we can pass the data or basically work with the data in this pattern.

3) **observer_push**: This showcase the push stratergy with which we can pass the data or basically work with the data in this pattern.

4) **exercise1**: The above 3 are based on 1 use case only, now this one consists of a different use case tackeled by pull stratergy as 
                      this stratergy is considered to be the best, to work with.

In the end we have our main class **ObserverApplication** which basically shows the flow of how these classes interact with each other. In our main class I have written the code for all of the above. So running the main class will lead to executing all these packages at the same time and in console you will see the outputs.
