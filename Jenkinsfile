pipeline {
  agent any
  stages {
    stage('Build') {
      agent any
      steps {
        sh 'echo "hi"'
        sh 'mvn -B  -DskipTests clean package'
        echo 'Build successful'
      }
    }

    stage('Test') {
      post {
        always {
          junit 'target/surefire-reports/*.xml'
        }

      }
      steps {
        sh 'mvn test'
      }
    }

  }
  options {
    skipStagesAfterUnstable()
  }
}