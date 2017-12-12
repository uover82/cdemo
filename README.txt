Cucumber/ Maven Release Demo Quickstart

Tool Dependencies:
   Java/ JDK - http://www.oracle.com/technetwork/java/javase/downloads/index.html
   Maven - https://maven.apache.org/download.cgi#

To deploy snapshot release:
   mvn deploy 

To release:
   mvn release:prepare
   mvn release:perform

To clean: mvn release:clean
   rollback: mvn release:rollback
