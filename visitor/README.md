Visitor Pattern

Visitor design pattern is one of the behavioral design patterns. It is used when we have to perform an operation on a group of similar kind of Objects. With the help of visitor pattern, we can move the operational logic from the objects to another class.

In this project you will see an example of Visitor pattern.

As the definition states that it is used to move the operational logic from similar kinds of objects to another class. 
If you see the files in the project we have two operations to be taken care of
    - Highlight Anchor.
    - Highlight Heading.

So we have created a interface 'Operation' and added apply method there with different parameter. And separated the highlighting logic to a different class 'HighlightOperation' class.

Similarly if in future if you need to add any other functionality then just add a class to handle the logic for them and use that in main method.
This way of doing is called as single responsibility principle.