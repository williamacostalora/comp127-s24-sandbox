## Why Lambda?
- Inner class approach
- Anonymous class approach

## Using Lambda
- Turn Decorable into functional interface (interface with only 1 abstract method)--we can add the annotation @FunctionalInterface to require the compiler to issue an error in case we break that.
- Lambda Expression approach
- Java provided functioal interfaces from [java.util.function package](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html) instead of our defined Decorable fuctional interface.  Our interface has a method that accept one String parameter and return nothing, ie, it consumes it.  Which interface in the java do this?
- Syntactic sugar (syntax that make the programming lanuage sweeter for human use, [Wikipedia](https://en.wikipedia.org/wiki/Syntactic_sugar))
- Method reference, vanilla decorator
