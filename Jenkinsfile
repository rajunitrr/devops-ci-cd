pipeline{

    agent any
    tools{
        maven "maven"
    }
    
    stages{
        
        stage("SCM checkout"){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/rajunitrr/devops-ci-cd.git']])
            }
        }
        
        stage("Build Process"){
            steps{
                script{
                    bat 'mvn clean install'
                }
            }
        }
        
        stage("Deploy war to container"){
            steps{
                deploy adapters: [tomcat9(credentialsId: 'tomact_admin', path: '', url: 'http://localhost:8080/')], contextPath: 'jenkinsCiCd', war: '**/*.war'
            }
        }
        
    }
    
    post{
        always{
            emailext attachLog: true,
            body: '''<html>

        <body>
                <p>Build Status: ${BUILD_STATUS}</p>
                <p>Build Number: ${BUILD_NUMBER}</p>
                <p>Check the <a href="${BUILD_URL}">console output</a>.</p>
            </body>

        </html>''', mimeType: 'text/html', replyTo: 'razkumar4528@gmail.com', subject: 'Pipeline Status : ${BUILD_NUMBER}', to: 'razkumar4528@gmail.com'
        }
    }
    
}

//SCM checkout
//build
//deploy war
//email