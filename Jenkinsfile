pipeline {
  agent any
  stages {
    stage('Initial') {
      steps {
        echo 'Hello World!'
        error 'AN ERROR'
        sh '''#!/bin/bash

ls'''
      }
    }

  }
}