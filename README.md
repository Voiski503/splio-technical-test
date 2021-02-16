##Context:

We call an API to send an email to a QA email account. This email is personnalized with values for the customer. 
The test consist of : 
- testing the API that sends the email 
- the rendering of variables in an email 
When we get the html of the email, we compare it to the expected html one. The function below is used to do so. 
Below you'll find the class "EmailDesign" with the function "isEqual" that is currently empty. 

##To do:

The goal of this exercise is to code the function "isEqual" to compare the expected EmailDesign to the EmailDesign we received.

You should : 
- Use only the JSoup, JUnit and log4j dependencies
- Log what you think is necessary with the Logger 

You can either: 
- Rewrite the class in Java 
- Code the isEqual() function right here in Kotlin
