#!/usr/bin/groovy

def firstTest() {

    node () {

        stage('build') {
            echo "Second stage"
        }
    }
}
return this
