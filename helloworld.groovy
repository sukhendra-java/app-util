#!/usr/bin/groovy

def firstTest(){

  node('test-node'){

    stage('build'){
      echo "Second stage"
    }

    stage('Cleanup workspace'){
      deleteDir()
    }
  }
}
return this
