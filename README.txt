Cucumber/ Maven Release Demo Quickstart

Tool Dependencies:
   Java/ JDK - http://www.oracle.com/technetwork/java/javase/downloads/index.html
   Maven - https://maven.apache.org/download.cgi#
   Artifactory - https://api.bintray.com/content/jfrog/artifactory/jfrog-artifactory-oss-$latest.zip;bt_package=jfrog-artifactory-oss-zip

   Installing Artifactory - https://www.jfrog.com/confluence/display/RTF/Installing+Artifactory

   # define artifactory_home 
   $ export ARTIFACTORY_HOME=<your artifactory home>  # macos/ linux
   $ set ARTIFACTORY_HOME=<your artifactory home> rem windows
   # start artifactory
   $ $ARTIFACTORY_HOME/bin/artifactory.sh # macos/ linux
   $ %ARTIFACTORY_HOME%\bin\artifactory.bat rem windows
   # browse to http://<your ip address>:8081
   o <presented with setup wizard>
   •	enter admin password
   •	skip proxy setup
   •	create maven repository
   •	<receive ‘repository setup complete’ msg>
   o	hit <cntrl c> to stop artifactory

# setup
# edit $HOME/.m2/settings.xml, adding server entries (git/ art-ss-repo/ art-r-repo)
# edit pom.xml, adding scm/ distributionManagement entries

To deploy snapshot release:
   mvn deploy 

To release:
   mvn release:prepare
   mvn release:perform

To clean: mvn release:clean
   rollback: mvn release:rollback

this ia a test
