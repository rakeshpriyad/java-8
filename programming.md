# Algo Interview questions


https://algorithms.tutorialhorizon.com/category/dynamic-programming/

1. How to find max if statement is not available in java
2. Write a program to print the fibonacci number.
Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
.limit(10)
.map(t -> t[0])
.forEach(x -> System.out.println(x));
3. Completable future example.
CompletableFuture<String> completableFuture
= CompletableFuture.supplyAsync(() -> "Hello");

    CompletableFuture<Void> future = completableFuture
      .thenAccept(s -> System.out.println("Computation returned: " + s));
4. What is the time complexity of Binary Search and explain how.
5. What will be time complexity of TreeMap when contains key method is used. And explain how.
6. Write a program to detect loop in linked list.
7. Write a program to detect loop and break the loop in linked list.
8. Write a program to rotate the array.
9. How to find the height of tree in non-recursive manner.
11. find the lowest common ancestor
12. Check if the binary tree is subtree of another tree
13. Tree traversal Inorder, Preorder, Post order
14. find the max depth of binary search tree
15. find the min/max value of binary search tree
16. searching element in BST
17. Has path sum , check if given sum exist in path from root to leaf any path
18. Insert into bst program
 

	