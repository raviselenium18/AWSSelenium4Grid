pipeline {
    agent any

    stages {
        stage('Building DEV') {
            steps {
                echo 'Building DEV project.'
            }
        }
        stage('Testing') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/raviselenium18/AWSSelenium4Grid.git']]])
                sh 'mvn clean test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying to staging server.'
            }
        }
    }
}
