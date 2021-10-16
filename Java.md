#Java Interview Questions (Reference github spring microservices https://github.com/rakeshpriyad/spring-microservices/blob/master/questions-2020/interview-2020-question.txt)
1. What is Generic?
2. What is Type inference?
3. What is type erasure?
4. What is Autoboxing ?
5. When static block is called?
6. How many times a class is loaded?
7. if we provide simple constructor, what compiler does add super ?
8. Constructor chaining in case of Super class and subclass.
9. Exception Handling.
10. Exception propagation.
11. Thread Pool vs Thread.
12. Advantages of executor framework.
13. Explain the functional Interface.
14. Explain the Lambda expression and its usage.
15. Explain the difference between Stream and Collection.
16. Write a program to sort the hashmap based on value.
17. Explain Concurrent HashMap changes (30 method added in java 8 in ConcurrentHashMap).
18. Explain Diamond problem / What is the purpose of Default method (in interface).
19. How to Convert List to Map .
20. Advantages and disadvantages of CompletableFuture.
21. Explain Stamped lock.
22. Write a program in java8 for Fibonacci series.
23. Explain MetaSpace in Java 8.
24. How Datetime api is different from old date time api, how calendar api is heavyweight?
25. Will lambda expression not create duplicate code problem?
26. What is the advantages of Lambda, is any performance improvement due to Lambda?
27. How to find max if statement is not available in java.
28. Explain the Advantages of Lambda.
29. Why filter/map is faster of java8
30. How to sort the file of 20 GB in 500 MB ram?
31. How to do impact analysis, if field credit card no will need to increase from 10 to 12 digits
Design an application of Credit Card, with asynchronous feature(Kafka)

32. How you deal with Performance tuning.
33. if you see, if any query is taking time, how you optimize it
34. Which Performance testing tool you are using.
35. Completable future example
CompletableFuture<String> completableFuture
= CompletableFuture.supplyAsync(() -> "Hello");

     CompletableFuture<Void> future = completableFuture
       .thenAccept(s -> System.out.println("Computation returned: " + s));

36. How to trace process in unix.
37. How to handler OOM, explain your approach.
38. if the web page loading take much time around 5 min, what will be the approach to solve it.
39. What are the things to take care if part of code is identified as causing issue.
	