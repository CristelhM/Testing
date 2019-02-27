# Command
Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you parameterize methods with different requests, delay or queue a request’s execution, and support undoable operations.

![Command](https://github.com/CristelhM/Testing/blob/marines-command/resources/command.png)

## Real-World Analogy
![Real World](https://github.com/CristelhM/Testing/blob/marines-command/resources/command-comic-1.png)

After a long walk through the city, you get to a nice restaurant and sit at the table by the window. A friendly waiter approaches you and quickly takes your order, writing it down on a piece of paper. The waiter goes to the kitchen and sticks the order on the wall. After a while, the order gets to the chef, who reads it and cooks the meal accordingly. The cook places the meal on a tray along with the order. The waiter discovers the tray, checks the order to make sure everything is as you wanted it, and brings everything to your table.

The paper order serves as a command. It remains in a queue until the chef is ready to serve it. The order contains all the relevant information required to cook the meal. It allows the chef to start cooking right away instead of running around clarifying the order details from you directly.

## Structure
![Structure](https://github.com/CristelhM/Testing/blob/marines-command/resources/command_structure.png)

## Example
Let's use a remote control as the example. Our remote is the center of home automation and can control everything. We'll just use a light as an example, that we can switch on or off, but we could add many more commands.

* Create our command interface.
* Create two concrete commands. One will turn on the lights, another turns off lights.
* Our invoker in this case is the remote control.
* Finally we'll set up a client to use the invoker.
