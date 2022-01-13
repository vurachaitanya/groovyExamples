pipeline {
    agent {
        label 'master'
    }
    stages {
        stage('WhaleSay Mooo') {
            agent {
                docker { image 'docker/whalesay' }
            }
            steps {
                ansiColor('xterm') {
                    sh 'cowsay moooo'
                }
            }
        }
    }
}
