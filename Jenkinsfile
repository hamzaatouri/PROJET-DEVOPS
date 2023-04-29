pipeline {
     agent any
       stages {
         stage('BUILDING PROJECT') {
            steps {
              
               sh 'mvn -f DEVOPS/pom.xml -B -DskipTests clean install'
              
                  }
              }
         }
}
