#!groovy

def firstTest(){
    echo "Second stage"
    stage('build'){
      echo "Second stage"
    }
    stage('Cleanup workspace'){
      deleteDir()
    }
}
return this
