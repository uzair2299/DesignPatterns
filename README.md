# Design Pattern
## Singleton Pattren
-
## Factory Method Pattren
To implement the factory pattern, also known as the factory method pattern, you can follow these steps:
 * Define an abstract base class or interface: Create an abstract class or interface that represents the common behavior of the objects you want to create. This class will serve as the product.
 * Create concrete classes: Implement concrete classes that inherit from the abstract base class or implement the interface. Each concrete class represents a specific type of object you want to create.
 * Define a factory class: Create a factory class that contains a method for creating objects. This method will encapsulate the creation logic and return instances of the abstract base class or interface.
 * Implement the factory method: In the factory class, implement the factory method. This method should take in parameters if necessary and use them to determine which concrete class to instantiate. It should create an instance of the concrete class and return it as an instance of the abstract base class or interface.

## Builder Method Pattren
The Builder pattern is a creational design pattern that provides a way to construct complex objects step by step. It separates the construction of an object from its representation, allowing the same construction process to create different representations. The pattern is useful when you need to create objects that have multiple optional parameters or configurations.
Here are the key points
* Define the product: First, you need to define the class for the object you want to build. This class should have multiple attributes or properties that can be configured.
* Create a builder: The product class should have a nested builder class. The builder class has the same attributes as the product class and provides setter methods to configure these attributes.
* Configure the builder: Use the builder's setter methods to configure the desired attributes of the object being built.
* Configure static builder method: In the product class, provide a static builder method that creates and returns a new instance of the builder.
* Add build method: Include a build method in the builder class that creates an instance of the product class using the configured attributes and returns it.
* Finally, call the build method on the builder to obtain the fully constructed object.

In the Builder pattern, there are two common approaches to defining fields: within the builder class itself or within the class being built. Both approaches have their advantages and considerations, so the choice depends on the specific requirements and design preferences of the application. Let's discuss each approach:
### Fields in the Builder Class:
* In this approach, the builder class has fields that mirror the attributes of the class being built. The builder class is responsible for holding the values of these attributes during the construction process.
* This approach allows for a clear separation of concerns, as the builder class solely focuses on the construction logic while the built class represents the final object with its attributes and behavior.
* It can make the builder class more self-contained and easier to manage, as it encapsulates the construction process.
* This approach is particularly useful when dealing with complex object construction, where the builder class helps organize and handle the various steps involved.
### Fields in the Class Being Built:
* In this approach, the class being built directly defines its own attributes as fields. The builder class is responsible for setting these attributes during construction.
* This approach provides a more straightforward representation of the final object, as its attributes are directly defined within the class itself.
* It may lead to less code duplication, as the builder class doesn't need to define fields that are already present in the class being built.
* This approach is useful when the class being built has a simple structure or when there is a preference for directly defining the attributes within the class.
