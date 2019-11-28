pipeline {
  agent any
  stages {
    stage('Build') {
      agent any
      steps {
        sh 'echo "hi"'
        sh 'mvn -B  -DskipTests clean package'
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

    stage('Deliver') {
      steps {
        sh './jenkins/scripts/deliver.sh'
      }
    }

  }
  options {
    skipStagesAfterUnstable()
  }
}