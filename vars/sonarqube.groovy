def call(credentialsId){
    withSonarQubeEvn(credentialsId: credentialsId)
    sh 'mvn clean package sonar:sonar'
}