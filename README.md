#splio-technical-test

Technical test sent to the QA candidates @Splio

####Description
- EmailDesign: model class that describe an email design. Please not change class attributes !
  An EmailDesign consists in various String parameters and the actual email html, represented by jsoup.nodes.Document
- FirstTest: test class you can use to test your code

####Running tests
mvn clean test -e -Dtest=FirstTest

####TODO:
- Fill the EmailDesign.isEqual func to test the equality between two EmailDesign objects. 
  - Please have detailed logs, and use the imported packages (log4j, jsoup & junit)
  - You can use Kotlin or Java
  
