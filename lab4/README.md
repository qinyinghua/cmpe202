# CMPE 202 - LAB #4 - Din Tai Fung Design Patterns



## CRC Cards

**The list of CRC Cards should include: Class Name, Responsibilities (Know and Do), and Collaborators for each Class in your Design.**

### Restaurant

| **RESPONSIBILITES**                                          |
| ------------------------------------------------------------ |
| Assign customer status<br />Provide the availability of tables <br />Notify the customers on the waiting list |
| **COLLABORATORS**                                            |
| Customer                                                     |

### Customer

| **RESPONSIBILITES**                                          |
| ------------------------------------------------------------ |
| Signup with name, cell number and number of people in the party<br />Confirm on the way by response a "confirm" message<br />Cancel by response a "leave" message |
| **COLLABORATORS**                                            |
| Restaurant                                                   |

## Patterns

 **An explanation of why you chose the Pattern (or Patterns) in your Design and also list the Objects (from your CRC list) that play which Role (Participant) in the Pattern(s).**

**Observer** pattern is a behavioral software **design pattern** in which a subject maintains a list of subscribers called observers and notifies them of any state changes usually by calling one of their methods. Once state change notification is received observer can request current state of the subject. [1]

![](https://github.com/qinyinghua/cmpe202/blob/master/lab4/composite-structure-example-observer.png)

In our use case, the "Din Tai Fung" **restaurant** is a subject. 

It maintains a list of subscribers / observers which in this case is a list of **customers**.  

**When there is any state changes** - table available or not available in this case,  the restaurant will notify the customers by calling one of the customer object methods. 

**Once the state change notification is received** by the customer object, the customer object can request current state of the restaurant (the subject object).



## References

[1] https://www.uml-diagrams.org/observer-pattern-uml-composite-diagram-example.html
