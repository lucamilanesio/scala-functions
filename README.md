# Brown-bag session-1: Scala functions

## Scala methods

Look at the [longlines](longlines) Scala project and see how you can define a function
as you would do also in Java: a method of an object.

- [LongLines object](longlines/src/main/scala/LongLines.scala) has two methods, one
  public and one private, exactly as you would do in Java.

- In Scala, differently from Java, methods are just functions and can be defined at any scope,
  including the body of another function.
  See [LongLines object](longlines/src/main/scala/LongLines.scala) and where the
  `processLine` function has been defined.

- Local functions can be private inside other functions providing enhanced
  encapsulation compared to Java. Also see how it can access the outer function scoped
  parameters, without the need to pass them over from `processFile` to `processLine`.

## First-class functions

In the [firstclass](firstclass) Scala project see how functions are a first-class object
in Scala and can be assigned to variables. [Java 8 introduced lambdas](https://www.w3schools.com/java/java_lambda.asp)
with a similar syntax in 2014, 10 years after Scala introduced them back in 2004.

- [FirstClassFunction](firstclass/src/main/scala/FirstClassFunctions.scala) defines
  the `increase` function as a variable, which is then compiled into a Java lambda.

- Lots of Scala libraries are based on first-class functions and accept them as parameters
  allowing to compose functions together with minimum effort.
  See how the `List(-10, 20, 30)` is first increased, then filtered and lastly printed
  with minimum effort and clean function composition.

- Scala also allows to reduce the typing boilerplate in the definition of the first-class
  functions by omitting the type when the target paramter type can be inferred.
  See how [FirstClassFunction](firstclass/src/main/scala/FirstClassFunctions.scala)
  can then define the `increment` function as simply `x => x + 1` and the `positive` function as
  `x => x > 0`, removing the need to specify which type the `x` variable is.

- Functions can also use the __placeholder syntax__ for specifying the paramters, allowing
  to further simplify the definition of functions in a cleaner form where the `_` placeholder
  represent the parameters of the function. See how `x => x + 1` then becomes `_ + 1` and
  the `positive` function can be just expressed as `_ > 0`.

## Partially-applied functions

Functions can be also applied to a subset to their arguments, resulting not into a value
but another function.

- See the [PartiallyApplied](partiallyapplied/src/main/scala/PartiallyApplied.scala)
  object where the `sum` function can be applied to only one of the two operands by specifing
  the value `1`, which is the definition of the `increment` function.

## Partial functions

A partial function in Scala is a function that is defined for only a subset of values of its
input parameters.
Partial functions allow to massively reduce the boilerplate of functions in their input
validations and prevent common programming errors by simply allowing the compiler to avoid
running the functions with unsupported values.

- See the [Partial](partial/src/main/scala/Partial.scala) object where the `divide` function
  is only defined when the divisor is different than zero. Many Scala libraries, like the
  collections, have methods that are designed to work with partial functions.
  The `collect` method execute the function only for the elements for which the function is
  defined.

## Curried functions

Functions can return other functions as a result of the partial application of their parameters,
similarly to what happens in the partially applied functions.
Scala implements [currying](https://en.wikipedia.org/wiki/Currying) which is a technique in
functional programming of decomposing a function with multiple arguments into composition of
functions that accept their single arguments.

- See the [Curried](curried/src/main/scala/Curried.scala) example where the `sum` function
  that takes two parameters can be decomposed into the `sum(1)` which is defined as `increment`
  and then applied to the final input value.

## Implicit functions

Scala allow to automatically invoke functions for satisfying type inference, which allows to
remove a lot of boilerplate that is typically needed for data type conversions.

- In the example [Implicit](implicitfunction/src/main/scala/Implicit.scala) the use
  of the `parseIntFromString` implicit function allows to automatically convert the string
  `"10"` into the integer `10` for execution the increment operation. Without implicit functions
  the code would need to explicitly call `parseIntFromString("10")`.

