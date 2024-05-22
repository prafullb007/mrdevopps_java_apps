// @Library('my-shared-library') _

pipeline{
    agent any
    stages{
        stage('Git Checkout'){
              steps{
                script{
                    git branch: 'main', credentialsId: 'githubcedential', url: 'https://github.com/prafullb007/mrdevopps_java_apps.git'

                }

            }
        }
            }
}