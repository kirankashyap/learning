#!groovy
node {
    def mvnHome
    stage('Preparation') { // for display purposes
    // Get some code from a GitHub repository
        checkout scm
    }
    stage('Compile') {
        bat(/mvn clean compile/)
    }
    stage('Test') {
       try {
           bat(/mvn test/)
       } catch (error) {
           throw error
       } finally {
          //Collect Unit test reports to show in Jenkins
          junit '**/target/surefire-reports/TEST-*.xml'
       }
    }
    stage('Build') {
       bat(/mvn package/)
    }
    stage('Deploy') {
       bat(/copy target\learning.war C:\Users\Kiran\Documents\workspace\servers\prod\tomcat\webapps\ /)
    }
}