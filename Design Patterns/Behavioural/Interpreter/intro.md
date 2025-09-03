## Introduction

Type: Behavioral design pattern.

Idea: Defines a grammar for a language (or expressions) and provides an interpreter that evaluates sentences in that language.

Used when you need to interpret/evaluate sentences in a domain-specific language (DSL).

It provides a mechanism to evaluate sentences in a language by representing their grammar as a set of classes. 

Each class represents a rule or expression in the grammar, and the pattern allows these classes to be composed hierarchically to interpret complex expressions.


## Real-life Analogy

Think of a calculator that parses and evaluates expressions like: 3 + 5 - 2

The interpreter pattern represents each symbol (numbers, operators) as an expression object, and evaluates them recursively.


## Key Participants

AbstractExpression: Declares an interface (e.g., interpret() method) for all expressions.

TerminalExpression: Represents a leaf node in the grammar (e.g., numbers, variables). These are the basic building blocks that the interpreter uses to interpret the language.

NonTerminalExpression: Represents composite rules in the grammar (e.g., add, subtract, and/or). They are responsible for handling composite expressions, which consist of multiple sub-expressions.

Context: Stores global info needed during interpretation (like variable values).

Client: Builds the expression tree and triggers interpretation.


## Where is it used?

SQL parsing (translating SQL queries into execution trees).

Regex engines (regex rules interpreted into matches).

Compilers & interpreters for DSLs.

Configuration languages (e.g., Expression evaluators in rules engines).


## Pros & Cons

Pros

Makes it easy to extend grammar (just add new expression classes).

Good for simple DSLs and rules engines.

Modularity: Components such as terminal and non-terminal expressions can be easily added or modified to support new language constructs or operations.

Separation of Concerns: The pattern separates the grammar interpretation from the client, allowing the client to focus on providing input expressions while leaving the interpretation logic to the interpreter components.

Cons

Can lead to class explosion (many expression classes).

Not efficient for complex grammars (use parser generators instead).
