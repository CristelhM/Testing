# Strategy
Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.
![Real world](https://github.com/CristelhM/Testing/blob/marines-strategy/resources/strategy.png)

## Real-World Analogy
![Real world](https://github.com/CristelhM/Testing/blob/marines-strategy/resources/strategy_comic_1.png)

Imagine that you have to get to the airport. You can catch a bus, order a cab, or get on your bicycle. These are your transportation strategies. You can pick one of the strategies depending on factors such as budget or time constraints.

## Structure
![Structure](https://github.com/CristelhM/Testing/blob/marines-strategy/resources/strategy_structure.png)

## Example
Let's use the example of a file compression tool - where we create either zip or rar files. 
* First we'll need a strategy: CompressionStrategy
* And we'll need to provide our two implementations, one for zip and one for rar: ZipCompressionStrategy , RarCompressionStrategy 
* Our context will provide a way for the client to compress the files. Let's say that there is a preferences setting in our application that sets which compression algorithm to use. We can change our strategy using the setCompressionStrategy method in the Context.: CompressionContext 
* It's obvious that all the client has to do now is pass through the files to the CompressionContext: Client

## Pros and Cons
### Pros
* You can swap algorithms used inside an object at runtime.
* You can isolate the implementation details of an algorithm from the code that uses it.
* You can replace inheritance with composition.
* Open/Closed Principle. You can introduce new strategies without having to change the context.

### Cons
* If you only have a couple of algorithms and they rarely change, there’s no real reason to overcomplicate the program with new classes and interfaces that come along with the pattern.
* Clients must be aware of the differences between strategies to be able to select a proper one.
* A lot of modern programming languages have functional type support that lets you implement different versions of an algorithm inside a set of anonymous functions. Then you could use these functions exactly as you’d have used the strategy objects, but without bloating your code with extra classes and interfaces.
