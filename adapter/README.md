Adapter Pattern

The Adapter design pattern is a structural pattern that allows the interface of an existing class to be used as another interface. It acts as a bridge between two incompatible interfaces, making them work together. This pattern involves a single class, known as the adapter, which is responsible for joining functionalities of independent or incompatible interfaces.

In this project you will see an example of adapter pattern.

Suppose a situation where you need to add a filter onto a Image. Now filter can be applied in two ways:
- By creating own filter and adding source code in the project only.
- By importing a third party filter and using it with the image.

Here in this project/example we will explore both the options.

Scenario 1: 

To view any image we need to have a view for it, so ImageView class is to give a view to the image present in Image class.
To apply the filter on image we will first create a ImageView by passing image as a parameter and then calling the apply method and passing instance of the filter in it.

This is the way we have implemented it by considering solid principles, so the above is just a way to apply a filter on a image.

Now the fact that we are open to extension so we now want to integrate the 3rd party filter in it. Here comes our scenario 2.

Scenario 2:

Suppose the 3rd party filter to apply is 'Caramel' filter present in 'filter' package.

To apply a 3rd party filter on a image present in the code we cannot just simple pass the Caramel Filter as a object to the apply method of imageView 
because we need to have filter which implements the 'Filter' interface to make it work.

Now the option left is to create a adapter in between ImageView and Caramel Filter to make them work with one another.
So 'CaramelAdapter' is the adapter which is acting as a bridge between them.