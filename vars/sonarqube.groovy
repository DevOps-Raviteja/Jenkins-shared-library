def call(credentialsId){
    withSoarQubeEvn(credentialsId: credentialsId)
    sh 'mvn clean package sonar:sonar'
}