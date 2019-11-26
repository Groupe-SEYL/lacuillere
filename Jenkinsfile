pipeline {
  agent any
  stages {
    stage('Initial') {
      steps {
        echo 'Hello World!'
        slackSend(username: 'sboomi', token: 'B5TJp88kc5vVkH3lTD60C3nN', teamDomain: 'projetdegroup-skm1036', sendAsText: true, failOnError: true, color: 'red', message: 'Hello', channel: '#chaine-ci')
      }
    }

  }
}