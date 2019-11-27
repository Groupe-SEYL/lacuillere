pipeline {
  agent any
  stages {
    stage('Initial') {
      steps {
        echo 'Hello World!'
        waitForQualityGate(abortPipeline: true)
        error 'AN ERROR'
        sh '''#!/bin/bash

ls'''
      }
    }

  }
}