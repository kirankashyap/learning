#!groovy
node {
    def mvnHome
    stage('Preparation') { // for display purposes
    // Get some code from a GitHub repository
    checkout scm
    // Get the Maven tool.
    // ** NOTE: This 'M3' Maven tool must be configured
    // **       in the global configuration.
    mvnHome = tool 'maven'
    }
    stage('Compile') {
        bat(/mvn clean compile/)
        //Collect Unit test reports to show in Jenkins
    }
    stage('Test') {
             bat(/"${mvnHome}\bin\mvn" test/)
             //Collect Unit test reports to show in Jenkins
             junit '**/target/surefire-reports/TEST-*.xml'
    }
    stage('Build') {
       bat(/"${mvnHome}\bin\mvn" package/)
    }
    stage('Deploy') {
       bat(/copy target\learning.war C:\Users\Kiran\Documents\workspace\servers\prod\tomcat\webapps\ /)
    }
}