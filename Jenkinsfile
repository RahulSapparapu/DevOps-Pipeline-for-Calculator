#!groovy
pipeline {
    agent any
    stages {
     stage('Maven Install and Build Jar') {
      steps {
       sh 'mvn clean package -DskipTests'
       }
     }
     stage('Docker Build') {
      steps {
        sh 'docker build -t sapparapurahul/calculatordocker:latest .'
      }
    }
     stage('Docker Hub'){
     steps{
 	  withDockerRegistry([ credentialsId: "Dockerhub", url: "" ]){
 	   sh 'docker push sapparapurahul/calculatordocker:latest'
 	  }
     }
   }
        
 } 
 }
