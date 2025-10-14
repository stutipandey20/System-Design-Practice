## Introduction

A types of behavioural design pattern, that provided a way to access the elements of an aggregate object (like a list) sequentially without exposing its underlying representation.

## Real life examples

You can use the same interface (hasNext(), next(), etc.) to iterate over any collection type — array, list, tree, custom data structure — without worrying about how it’s implemented internally. For example:

-> Java’s built-in Iterator and Iterable interfaces (java.util.Iterator, java.lang.Iterable)
-> for-each loop in Java internally uses the iterator pattern.
-> Database cursors, file readers, etc.

## Pros and Cons

Advantages:

1. Hides internal structure of collection.

2. Simplifies traversal logic.

3. Supports multiple traversal methods (e.g., forward, reverse).

4. Promotes Single Responsibility (collection manages data; iterator manages traversal).

Disadvantages:

1. Slightly increases complexity (extra classes/interfaces).

2. May be less efficient than direct access in some cases.