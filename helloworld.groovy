#!groovy

def firstTest(){
    stage('build'){
    }
    stage('Cleanup workspace'){
      deleteDir()
    }
}
return this
