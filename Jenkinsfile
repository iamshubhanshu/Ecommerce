pipeline {
    agent any
    tools {
        maven "MAVEN"
        jdk "Java 9"
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
//         stage('Test') {
//             steps {
//                 echo 'Testing..'
//             }
//         }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
