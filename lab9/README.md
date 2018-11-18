# CMPE 202 - LAB #9 - Java Lambda Design Pattern
Requirements:
Use any of the Course Design Pattern Examples or use Google to search for an example of one of the GoF Design Patterns (in Java). Re-implement the Example in Java Lambda / Functional Style Compare the two solutions and write a summary in Markdown format in the README.MD file in your Repo. Commit the original Java Design Pattern version along with your Functional version to GitHub.

I have implemented two design patterns with Java Lambda. One is the Chain of Responsibility. Another is Strategy. 
Folder structure: 
- strategy  (the original Java implementation)
- strategy_lambda  (the lambda implementation)
- chain_of_responsibility  (the original Java implementation)
- chain_of_responsibility_lambda  (the lambda implementation)


## Lambda Function for Chain of Responsibility Design Pattern
Implement the Lambda function on the "Client" and "Handler" objects. 

Use the Java JDK 8 standard funcational interface "Predicate".  

        // Predicate functions
        Predicate<String> h1Tester =  (a) -> a.equalsIgnoreCase("R1");		
        Predicate<String> h2Tester  = (a) -> a.equalsIgnoreCase("R2");
        Predicate<String> h3Tester  = (a) -> a.equalsIgnoreCase("R3");
        
Use the Java JDK 8 "Stream" to obtain a source of objects

        requests.stream().forEach(p -> {System.out.println( "Sending "+p+"..."); h1.handleRequest(p);});
        
## Lambda Function for Strategy Design Pattern

Use the Java JDK 8 Lambda function to add different sorting strategy into the list.  

        List<SortingStrategy> sortingStrategies = new ArrayList<SortingStrategy>();
        sortingStrategies.add((a)-> { new BubbleSort().sort(a);});
        sortingStrategies.add((a)-> { new MergeSort().sort(a);});
        sortingStrategies.add((a)-> { new QuickSort().sort(a);});


Use the Java JDK 8 Lambda function change strategy, sort and display the sorting result.  

        sortingStrategies.forEach(  (s) -> {dataset.changeStrategy(s); dataset.doSort(); dataset.display(); dataset.resetData(); } );     