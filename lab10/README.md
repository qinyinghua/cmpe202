# Lab 10 AspectJ & Feature IDE

## Feature Model Configuration for each Machine

Take screenshots of the Feature Model Configuration for each Machine along with the output of running the Test Program with each configuration.

##### Gumball machine V2

##### 1) Model - Slot Model with Cost 50 cents

![1543103763912](C:\Yinghua\SJSU\2018Fall\CMPE202\Githubqinyinghuacmpe202\cmpe202\lab10\README.assets\1543103763912.png)

##### 2) Model - Slot Model with Cost 25 cents

![1543103733527](C:\Yinghua\SJSU\2018Fall\CMPE202\Githubqinyinghuacmpe202\cmpe202\lab10\README.assets\1543103733527.png)

##### 3) Model - Crank Model - Two QTR with Cost 50 cents

![1543103754717](C:\Yinghua\SJSU\2018Fall\CMPE202\Githubqinyinghuacmpe202\cmpe202\lab10\README.assets\1543103754717.png)

##### 4) Model - Crank Model - One QTR with Cost 25 cents

![1543103745865](C:\Yinghua\SJSU\2018Fall\CMPE202\Githubqinyinghuacmpe202\cmpe202\lab10\README.assets\1543103745865.png)

## Compare the solution

- Compare your original solution to this problem from "LAB #1 - Code Maintainability" with the Feature IDE / AspectJ solution.

  ##### The LAB #1 implementation

  The LAB #1 implementation is using generalization to extend the GumballMachine to three different types of GumballMachines:  GumballMachine25, GumballMachine50A, GumballMachine50B.

  Each type of Gumball Machine has different values for the properties: Cost and Coins Type.

  1) GumballMachine25 - cost is 25 cents, coin type is 25-cents quarter coin

  2) GumballMachine50A - cost is 50 cents, coin type is 25-cents quarter coin

  3) GumballMachine50B - cost is 50 cents, coin type is  coins (25-cents coin, 10-cents coin, 5-cents coin, 1-cent coin)

  ![1543103690040](C:\Yinghua\SJSU\2018Fall\CMPE202\Githubqinyinghuacmpe202\cmpe202\lab10\README.assets\1543103690040.png)

  ##### LAB #10 implementation

  The LAB #10 Gumball Machine V1 has 3 types of Gumball Machines as the Lab 1 has. 

  However, Lab #10 is using the Aspect approach.  It defines the 3 types of Gumball Machines this. 

  ![1543103665058](C:\Yinghua\SJSU\2018Fall\CMPE202\Githubqinyinghuacmpe202\cmpe202\lab10\README.assets\1543103665058.png)

- Gumball Machine QTR25 - Cost 25 and Coins Type Quarter

  - It implemented advice for
    - GumballMachine.getTenant(..)
    - GumballMachine.insertQuarter(..)
    - GumballMachine.turnTheCrank(..)

  ![1543103644828](C:\Yinghua\SJSU\2018Fall\CMPE202\Githubqinyinghuacmpe202\cmpe202\lab10\README.assets\1543103644828.png)

- Gumball Machine QTR50 - Cost 50 and Coins Type supports quarter coin only

  - It implemented advice for
    - GumballMachine.getTenant(..)
    - GumballMachine.insertQuarter(..)
    - GumballMachine.turnTheCrank(..)

  ![1543103904403](C:\Yinghua\SJSU\2018Fall\CMPE202\Githubqinyinghuacmpe202\cmpe202\lab10\README.assets\1543103904403.png)

- Gumball Machine COINS50 - Cost 50 and Coins Type supports coins 25, 20, 5, 1 cent(s)

  - It implemented advice for
    - GumballMachine.getTenant(..)
    - GumballMachine.insertQuarter(..)
    - GumballMachine.insertCoin(..)
    - GumballMachine.turnTheCrank(..)

  ![1543103994232](C:\Yinghua\SJSU\2018Fall\CMPE202\Githubqinyinghuacmpe202\cmpe202\lab10\README.assets\1543103994232.png)

- My Feature IDE project folder: <URL here>



