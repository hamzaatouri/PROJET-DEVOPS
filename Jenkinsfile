pipeline {
     agent any
         stage('BUILDING PROJECT') {
            steps {
              
               sh 'mvn -f DEVOPS PROJECT/pom.xml -B -DskipTests clean install'
              
                  }
         }
}
