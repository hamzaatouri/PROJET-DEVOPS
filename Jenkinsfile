pipeline {
     agent any
         stage('BUILDING PROJECT') {
            steps {
              
               sh 'mvn -f PROJET-DEVOPS/pom.xml -B -DskipTests clean install'
              
                  }
         }
}
