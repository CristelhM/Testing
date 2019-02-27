# Singleton
Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.
![Structure](https://github.com/CristelhM/Testing/blob/marines-singleton/resources/singleton.png)

## Real-World Analogy
![Structure](https://github.com/CristelhM/Testing/blob/marines-singleton/resources/singleton_comic.png)
The government is an excellent example of the Singleton pattern. A country can have only one official government. Regardless of the personal identities of the individuals who form governments, the title, “The Government of X”, is a global point of access that identifies the group of people in charge.

## Structure
![Structure](https://github.com/CristelhM/Testing/blob/marines-singleton/resources/singleton_structure.png)

## Example
* Make constructor as private.
* Make a private static instance (class-member) of this singleton class. But, DO NOT instantiate it.
* Write a static/factory method that checks the static instance member for null and creates the instance. At last, it returns an object of the singleton class.

## Pros and Cons
### Pros
* You can be sure that a class has only a single instance.
* You gain a global access point to that instance.
* The singleton object is initialized only when it’s requested for the first time.
 
### Cons
* Violates the Single Responsibility Principle. The pattern solves two problems at the time.
* The Singleton pattern can mask bad design, for instance, when the components of the program know too much about each other.
* The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create a singleton object several times.
* It may be difficult to unit test the client code of the Singleton because many test frameworks rely on inheritance when producing mock objects. Since the constructor of the singleton class is private and overriding static methods is impossible in most languages, you will need to think of a creative way to mock the singleton. Or just don’t write the tests. Or don’t use the Singleton pattern.
 