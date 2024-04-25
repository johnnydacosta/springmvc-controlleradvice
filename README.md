# Controller Advice in Spring boot application

The ExceptionHandlerExceptionResolver is responsible to find the right handler to resolve a specific exception type

`org/springframework/web/servlet/mvc/method/annotation/ExceptionHandlerExceptionResolver.java`

The function `initExceptionHandlerAdviceCache` will register at the runtime all the bean annotated with `@ControllerAdvice`.
