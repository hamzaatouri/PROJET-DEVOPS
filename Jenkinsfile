pipeline {
     agent any
       stages {
         stage('BUILDING PROJECT') {
            steps {
              
               sh 'mvn -f DEVOPS/pom.xml -B -DskipTests clean install'
              
                  }
            }
            
       stage('SONARQUBE TEST') {
           steps{
               withSonarQubeEnv('sonarqube-8.9.7') { 
        
                         sh "mvn -f DEVOPS/pom.xml clean package sonar:sonar"
                                                    }
                                           }
                              }
            
            
       stage('TEST UNITAIRE'){
            steps{
                sh 'mvn -f DEVOPS/pom.xml test'
                }
                   post{
                       always{
                            junit '**/target/surefire-reports/TEST-*.xml'
                             }
                        }
                    }
            
               }
        }
