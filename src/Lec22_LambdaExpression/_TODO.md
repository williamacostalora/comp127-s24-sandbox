# Calling RouderPrinter.round2PrintDecorated method
## Options before Java SE 8
- implement Decorator in seperate file of the driver class -> instanciate it -> use it to call the method
- implement Decorator in the same file of the driver class -> instanciate it -> use it to call the method
- implement Decorator as inner class in the driver class -> instanciate it -> use it to call the method
- implement Decorator as Anonymous class in the driver class

## Option starting Java SE 8
- implement Decorator as Lambda Expression in the driver class

## Can we do better?
- Use Java provided functioal interfaces from [java.util.function package](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html) instead defining our Decorable fuctional interface.  Our interface has a method that accept one String parameter and return nothing, ie, it consumes it.  Which interface in the java.util.function package can do this?
- Use syntactic sugar to make the code sweeter ([Wikipedia](https://en.wikipedia.org/wiki/Syntactic_sugar))
- Use method reference if we have method a method with the same signiture of the one in the functional interface
