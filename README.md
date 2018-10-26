# Test-Automation
Respository with multiple projects related to test automation, some of these projects use standards defined in POM  
and screenplay.  

This repository contains projects created in multiple sofware languages and frameworks including:  
-Java  
-Selenium WebDriver  
-Cucumber  
-Serenity  
-Junit  
-Gradle  

In the included projects that make use of the serenity framework, you can generate a report after  
executing a test, here are some useful commands:  
gradle clean test  
gradle clearHistory //Version dependent  
gradle clearReports  
gradle clean  
gradle aggregate //type after running test  

Keep in mind that you need to download the gradle bin file from the gradle web page https://gradle.org/  
After that make sure to unzip the folder and add it to a classpath.  

In case that the project doesn't generate an index.html in the serenity folder of the project,  
use the build gradle dependencies in the text file included in the repository.