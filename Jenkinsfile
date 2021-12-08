pipeline {
    agent any

    tools{
        maven 'local maven'
    }

     stages{
        stage('Build'){
            steps {
            	echo 'Building...'
                sh 'mvn clean package'
            }
        }
    }
}