pipeline {
    agent {
        label 'master'
    }
    stages {
        stage('FunBox Fortune') {
            agent {
                docker { image 'wernight/funbox' }
            }
            steps {
                ansiColor('xterm') {
                    sh 'fortune'
                }
            }
        }
    }
}

